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
	NodeContainer terminal_1;
	terminal_1.Create (1);
	NodeContainer terminal_2;
	terminal_2.Create (1);
	NodeContainer terminal_3;
	terminal_3.Create (1);
	NodeContainer router_0;
	router_0.Create (1);
	NodeContainer router_1;
	router_1.Create (1);
	NodeContainer router_2;
	router_2.Create (1);
	NodeContainer router_3;
	router_3.Create (1);
	NodeContainer switch_0;
	switch_0.Create (1);

	InternetStackHelper internet; 
	internet.InstallAll (); 

	PointToPointHelper pointToPoint_0;
	pointToPoint_0.SetDeviceAttribute ("DataRate", StringValue ("100.0Mbps"));
	pointToPoint_0.SetChannelAttribute ("Delay", StringValue ("1.0ms"));

	NodeContainer p2pNodes_0;
	p2pNodes_0.Add ( router_3);
	p2pNodes_0.Add (terminal_2);

	NetDeviceContainer devices_pointToPoint_0;
	devices_pointToPoint_0 = pointToPoint_0.Install ( p2pNodes_0);

	Ipv4AddressHelper address_pointToPoint_0;
	address_pointToPoint_0.SetBase ("10.1.0.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_0;
	interfaces_pointToPoint_0 = address_pointToPoint_0.Assign (devices_pointToPoint_0);

	interfaces_pointToPoint_0.SetMetric( 0, 0);
	interfaces_pointToPoint_0.SetMetric( 1, 0);

	PointToPointHelper pointToPoint_1;
	pointToPoint_1.SetDeviceAttribute ("DataRate", StringValue ("300.0Mbps"));
	pointToPoint_1.SetChannelAttribute ("Delay", StringValue ("3.0ms"));

	NodeContainer p2pNodes_1;
	p2pNodes_1.Add ( router_3);
	p2pNodes_1.Add (router_2);

	NetDeviceContainer devices_pointToPoint_1;
	devices_pointToPoint_1 = pointToPoint_1.Install ( p2pNodes_1);

	Ipv4AddressHelper address_pointToPoint_1;
	address_pointToPoint_1.SetBase ("10.1.1.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_1;
	interfaces_pointToPoint_1 = address_pointToPoint_1.Assign (devices_pointToPoint_1);

	interfaces_pointToPoint_1.SetMetric( 0, 2);
	interfaces_pointToPoint_1.SetMetric( 1, 2);

	PointToPointHelper pointToPoint_2;
	pointToPoint_2.SetDeviceAttribute ("DataRate", StringValue ("400.0Mbps"));
	pointToPoint_2.SetChannelAttribute ("Delay", StringValue ("4.0ms"));

	NodeContainer p2pNodes_2;
	p2pNodes_2.Add ( router_0);
	p2pNodes_2.Add (router_3);

	NetDeviceContainer devices_pointToPoint_2;
	devices_pointToPoint_2 = pointToPoint_2.Install ( p2pNodes_2);

	Ipv4AddressHelper address_pointToPoint_2;
	address_pointToPoint_2.SetBase ("10.1.2.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_2;
	interfaces_pointToPoint_2 = address_pointToPoint_2.Assign (devices_pointToPoint_2);

	interfaces_pointToPoint_2.SetMetric( 0, 3);
	interfaces_pointToPoint_2.SetMetric( 1, 3);

	PointToPointHelper pointToPoint_3;
	pointToPoint_3.SetDeviceAttribute ("DataRate", StringValue ("400.0Mbps"));
	pointToPoint_3.SetChannelAttribute ("Delay", StringValue ("2.0ms"));

	NodeContainer p2pNodes_3;
	p2pNodes_3.Add ( router_0);
	p2pNodes_3.Add (router_1);

	NetDeviceContainer devices_pointToPoint_3;
	devices_pointToPoint_3 = pointToPoint_3.Install ( p2pNodes_3);

	Ipv4AddressHelper address_pointToPoint_3;
	address_pointToPoint_3.SetBase ("10.1.3.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_3;
	interfaces_pointToPoint_3 = address_pointToPoint_3.Assign (devices_pointToPoint_3);

	interfaces_pointToPoint_3.SetMetric( 0, 1);
	interfaces_pointToPoint_3.SetMetric( 1, 1);

	PointToPointHelper pointToPoint_4;
	pointToPoint_4.SetDeviceAttribute ("DataRate", StringValue ("300.0Mbps"));
	pointToPoint_4.SetChannelAttribute ("Delay", StringValue ("1.0ms"));

	NodeContainer p2pNodes_4;
	p2pNodes_4.Add ( router_0);
	p2pNodes_4.Add (router_2);

	NetDeviceContainer devices_pointToPoint_4;
	devices_pointToPoint_4 = pointToPoint_4.Install ( p2pNodes_4);

	Ipv4AddressHelper address_pointToPoint_4;
	address_pointToPoint_4.SetBase ("10.1.4.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_4;
	interfaces_pointToPoint_4 = address_pointToPoint_4.Assign (devices_pointToPoint_4);

	interfaces_pointToPoint_4.SetMetric( 0, 0);
	interfaces_pointToPoint_4.SetMetric( 1, 0);

	PointToPointHelper pointToPoint_5;
	pointToPoint_5.SetDeviceAttribute ("DataRate", StringValue ("100.0Mbps"));
	pointToPoint_5.SetChannelAttribute ("Delay", StringValue ("1.0ms"));

	NodeContainer p2pNodes_5;
	p2pNodes_5.Add ( terminal_3);
	p2pNodes_5.Add (router_1);

	NetDeviceContainer devices_pointToPoint_5;
	devices_pointToPoint_5 = pointToPoint_5.Install ( p2pNodes_5);

	Ipv4AddressHelper address_pointToPoint_5;
	address_pointToPoint_5.SetBase ("10.1.5.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_pointToPoint_5;
	interfaces_pointToPoint_5 = address_pointToPoint_5.Assign (devices_pointToPoint_5);

	interfaces_pointToPoint_5.SetMetric( 0, 0);
	interfaces_pointToPoint_5.SetMetric( 1, 0);

	CsmaHelper csma_6;
	csma_6.SetChannelAttribute ("DataRate", StringValue ("500.0Mbps"));
	csma_6.SetChannelAttribute ("Delay", StringValue ("1.0ms"));

	NodeContainer nodes_csma_6;
	nodes_csma_6.Add (terminal_0 );
	nodes_csma_6.Add (terminal_1 );
	nodes_csma_6.Add (router_1 );
	NetDeviceContainer devices_csma_6;
	devices_csma_6 = csma_6.Install ( nodes_csma_6);

	Ipv4AddressHelper address_csma_6;
	address_csma_6.SetBase ("10.1.8.0" , "255.255.255.0");
	Ipv4InterfaceContainer interfaces_csma_6;
	interfaces_csma_6 = address_csma_6.Assign (devices_csma_6);

	interfaces_csma_6.SetMetric( 0, 0);
	interfaces_csma_6.SetMetric( 1, 0);
	interfaces_csma_6.SetMetric( 2, 0);

	OnOffHelper onoff_0 ("ns3::TcpSocketFactory", Address (InetSocketAddress (interfaces_csma_6.GetAddress (1) ,1 )));
	onoff_0.SetAttribute ("DataRate", StringValue ("0.0Kbps"));
	onoff_0.SetAttribute ("PacketSize", UintegerValue (0.0));

	ApplicationContainer apps_0 = onoff_0.Install (terminal_2);
	apps_0.Start (Seconds (0.0));
	apps_0.Stop (Seconds (0.1));

	PacketSinkHelper sink_0 ("ns3::TcpSocketFactory", Address (InetSocketAddress (Ipv4Address::GetAny (), 1 )));
	apps_0 = sink_0.Install (terminal_1);
	apps_0.Start (Seconds (0.0));
	apps_0.Stop (Seconds (0.1));

	OnOffHelper onoff_1 ("ns3::TcpSocketFactory", Address (InetSocketAddress (interfaces_pointToPoint_0.GetAddress (1) ,389 )));
	onoff_1.SetAttribute ("DataRate", StringValue ("10000.0Kbps"));
	onoff_1.SetAttribute ("PacketSize", UintegerValue (200.0));

	ApplicationContainer apps_1 = onoff_1.Install (terminal_1);
	apps_1.Start (Seconds (0.0));
	apps_1.Stop (Seconds (1.1));

	PacketSinkHelper sink_1 ("ns3::TcpSocketFactory", Address (InetSocketAddress (Ipv4Address::GetAny (), 389 )));
	apps_1 = sink_1.Install (terminal_2);
	apps_1.Start (Seconds (0.0));
	apps_1.Stop (Seconds (1.1));

	pointToPoint_0.EnablePcap ("router_3" , router_3);
	pointToPoint_0.EnablePcap ("terminal_2" , terminal_2);
	pointToPoint_1.EnablePcap ("router_3" , router_3);
	pointToPoint_1.EnablePcap ("router_2" , router_2);
	pointToPoint_2.EnablePcap ("router_0" , router_0);
	pointToPoint_2.EnablePcap ("router_3" , router_3);
	pointToPoint_3.EnablePcap ("router_0" , router_0);
	pointToPoint_3.EnablePcap ("router_1" , router_1);
	pointToPoint_4.EnablePcap ("router_0" , router_0);
	pointToPoint_4.EnablePcap ("router_2" , router_2);
	pointToPoint_5.EnablePcap ("terminal_3" , terminal_3);
	pointToPoint_5.EnablePcap ("router_1" , router_1);
	csma_6.EnablePcap ("terminal_0" , terminal_0);
	csma_6.EnablePcap ("terminal_1" , terminal_1);
	csma_6.EnablePcap ("router_1" , router_1);

	// Trace routing tables 
	Ipv4GlobalRoutingHelper g;
	Ptr<OutputStreamWrapper> routingStream = Create<OutputStreamWrapper> ("routing_table", std::ios::out);
	g.PrintRoutingTableAllAt (Seconds (1), routingStream);

	Ipv4GlobalRoutingHelper::PopulateRoutingTables ();

	
	/* Start and clean simulation. */
	
	Simulator::Run ();
	Simulator::Destroy ();
}

