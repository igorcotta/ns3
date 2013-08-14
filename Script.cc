#include "ns3/core-module.h"
#include "ns3/network-module.h"
#include "ns3/csma-module.h"
#include "ns3/internet-module.h"
#include "ns3/point-to-point-module.h"
#include "ns3/applications-module.h"
#include "ns3/ipv4-global-routing-helper.h"

using namespace ns3;

int main(int argc, char *argv[]){

	NodeContainer terminal_0;
	terminal_0.Create (1);
	NodeContainer switch_0;
	switch_0.Create (1);
	NodeContainer switch_1;
	switch_1.Create (1);
	NodeContainer switch_2;
	switch_2.Create (1);

	InternetStackHelper internet; 
	internet.InstallAll (); 

	PointToPointHelper pointToPoint_0;
	pointToPoint_0.SetDeviceAttribute ("DataRate", StringValue ("0.0Mbps"));
	pointToPoint_0.SetChannelAttribute ("Delay", StringValue ("0.0ms"));

	NodeContainer p2pNodes_0;
	p2pNodes_0.Add ( terminal_0);
	p2pNodes_0.Add (switch_0);

	NetDeviceContainer devices_pointToPoint_0;
	devices_pointToPoint_0 = pointToPoint_0.Install ( p2pNodes_0);

	Ipv4AddressHelper address_pointToPoint_0;
	address_pointToPoint_0.SetBase ("10.1.0.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_0;
	interfaces_pointToPoint_0 = address_pointToPoint_0.Assign (devices_pointToPoint_0);

	interfaces_pointToPoint_0.SetMetric( 0, 0);
	interfaces_pointToPoint_0.SetMetric( 1, 0);

	CsmaHelper csma_1;
	csma_1.SetChannelAttribute ("DataRate", StringValue ("0.0Mbps"));
	csma_1.SetChannelAttribute ("Delay", StringValue ("0.0ms"));

	NodeContainer nodes_csma_1;
	nodes_csma_1.Add (terminal_0 );
	NetDeviceContainer devices_csma_1;
	devices_csma_1 = csma_1.Install ( nodes_csma_1);

	Ipv4AddressHelper address_csma_1;
	address_csma_1.SetBase ("10.1.1.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_csma_1;
	interfaces_csma_1 = address_csma_1.Assign (devices_csma_1);

	interfaces_csma_1.SetMetric( 0, 0);

	OnOffHelper onoff_0 ("ns3::TcpSocketFactory", Address (InetSocketAddress (interfaces_wifi_2.GetAddress (0) ,1 )));
	onoff_0.SetAttribute ("DataRate", StringValue ("0.0Kbps"));
	onoff_0.SetAttribute ("PacketSize", UintegerValue (0.0));

	ApplicationContainer apps_0 = onoff_0.Install (terminal_0);
	apps_0.Start (Seconds (0.0));
	apps_0.Stop (Seconds (0.1));

	PacketSinkHelper sink_0 ("ns3::TcpSocketFactory", Address (InetSocketAddress (Ipv4Address::GetAny (), 1 )));
	apps_0 = sink_0.Install (switch_2);
	apps_0.Start (Seconds (0.0));
	apps_0.Stop (Seconds (0.1));

	pointToPoint_0.EnablePcap ("terminal_0" , terminal_0);
	pointToPoint_0.EnablePcap ("switch_0" , switch_0);
	csma_1.EnablePcap ("terminal_0" , terminal_0);

	// Trace routing tables 
	Ipv4GlobalRoutingHelper g;
	Ptr<OutputStreamWrapper> routingStream = Create<OutputStreamWrapper> ("routing_table", std::ios::out);
	g.PrintRoutingTableAllAt (Seconds (1), routingStream);

	Ipv4GlobalRoutingHelper::PopulateRoutingTables ();

	
	/* Start and clean simulation. */
	
	Simulator::Run ();
	Simulator::Destroy ();
}

