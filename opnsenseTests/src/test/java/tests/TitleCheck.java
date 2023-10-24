package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class TitleCheck extends LoginAction {
	//Purpose of this pool of tests is to check the title of each main page on GUI
	//It's dull, that's why it needs to be done
	//Login page is checked separately in several different tests, so it would not be there
	
	@Test(groups={"title_check","regression"})
	public void dashboardTitle() {
		driver.get(url+"index.php");
		Assert.assertEquals(driver.getTitle(), "Dashboard | Lobby | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void licenseTitle() {
		driver.get(url+"ui/core/license");
		Assert.assertEquals(driver.getTitle(), "License | Lobby | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void passwordTitle() {
		driver.get(url+"system_usermanager_passwordmg.php");
		Assert.assertEquals(driver.getTitle(), "Password | Lobby | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void healthTitle() {
		driver.get(url+"ui/diagnostics/systemhealth");
		Assert.assertEquals(driver.getTitle(), "Health | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void insightTitle() {
		driver.get(url+"ui/diagnostics/networkinsight");
		Assert.assertEquals(driver.getTitle(), "Insight | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void netflowTitle() {
		driver.get(url+"ui/diagnostics/netflow");
		Assert.assertEquals(driver.getTitle(), "NetFlow | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void repotringsettingsTitle() {
		driver.get(url+"reporting_settings.php");
		Assert.assertEquals(driver.getTitle(), "Settings | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void trafficTitle() {
		driver.get(url+"ui/diagnostics/traffic");
		Assert.assertEquals(driver.getTitle(), "Traffic | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void unboundDNSTitle() {
		driver.get(url+"ui/unbound/overview");
		Assert.assertEquals(driver.getTitle(), "Unbound DNS | Reporting | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void systemUsersTitle() {
		driver.get(url+"system_usermanager.php");
		Assert.assertEquals(driver.getTitle(), "Users | Access | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void systemGroupsTitle() {
		driver.get(url+"system_groupmanager.php");
		Assert.assertEquals(driver.getTitle(), "Groups | Access | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void systemServersTitle() {
		driver.get(url+"system_authservers.php");
		Assert.assertEquals(driver.getTitle(), "Servers | Access | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void systemTesterTitle() {
		driver.get(url+"diag_authentication.php");
		Assert.assertEquals(driver.getTitle(), "Tester | Access | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void configBackupsTitle() {
		driver.get(url+"diag_backup.php");
		Assert.assertEquals(driver.getTitle(), "Backups | Configuration | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void configDefaultsTitle() {
		driver.get(url+"diag_defaults.php");
		Assert.assertEquals(driver.getTitle(), "Defaults | Configuration | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void configHistoryTitle() {
		driver.get(url+"diag_confbak.php");
		Assert.assertEquals(driver.getTitle(), "History | Configuration | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firmwareSystemTitle() {
		driver.get(url+"ui/core/firmware#status");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
		
		driver.get(url+"ui/core/firmware#settings");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
		
		driver.get(url+"ui/core/firmware#changelog");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
		
		driver.get(url+"ui/core/firmware#updates");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
		
		driver.get(url+"ui/core/firmware#plugins");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
		
		driver.get(url+"ui/core/firmware#packages");
		Assert.assertEquals(driver.getTitle(), "Firmware | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firmwareReporterTitle() {
		driver.get(url+"crash_reporter.php");
		Assert.assertEquals(driver.getTitle(), "Reporter | Firmware | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firmwareLogFileTitle() {
		driver.get(url+"ui/diagnostics/log/core/pkg");
		Assert.assertEquals(driver.getTitle(), "Log File | Firmware | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void gatewaysSingleTitle() {
		driver.get(url+"system_gateways.php");
		Assert.assertEquals(driver.getTitle(), "Single | Gateways | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void gatewaysGroupsTitle() {
		driver.get(url+"system_gateway_groups.php");
		Assert.assertEquals(driver.getTitle(), "Group | Gateways | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void gatewaysLogFileTitle() {
		driver.get(url+"ui/diagnostics/log/core/gateways");
		Assert.assertEquals(driver.getTitle(), "Log File | Gateways | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void highavailabilitySettingsTitle() {
		driver.get(url+"system_hasync.php");
		Assert.assertEquals(driver.getTitle(), "Settings | High Availability | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void highavailabilityStatusTitle() {
		driver.get(url+"status_habackup.php");
		Assert.assertEquals(driver.getTitle(), "Status | High Availability | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void routesConfigurationTitle() {
		driver.get(url+"ui/routes");
		Assert.assertEquals(driver.getTitle(), "Configuration | Routes | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void routesStatusTitle() {
		driver.get(url+"ui/diagnostics/interface/routes");
		Assert.assertEquals(driver.getTitle(), "Status | Routes | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void routesLogFileTitle() {
		driver.get(url+"ui/diagnostics/log/core/routing");
		Assert.assertEquals(driver.getTitle(), "Log File | Routes | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsAdministrationTitle() {
		driver.get(url+"system_advanced_admin.php");
		Assert.assertEquals(driver.getTitle(), "Administration | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsCronTitle() {
		driver.get(url+"ui/cron");
		Assert.assertEquals(driver.getTitle(), "Cron | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsGeneralTitle() {
		driver.get(url+"system_general.php");
		Assert.assertEquals(driver.getTitle(), "General | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsLogginTitle() {
		driver.get(url+"diag_logs_settings.php");
		Assert.assertEquals(driver.getTitle(), "Logging | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsLogginTargetsTitle() {
		driver.get(url+"ui/syslog/");
		Assert.assertEquals(driver.getTitle(), "Logging / targets | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsMiscellaneousTitle() {
		driver.get(url+"system_advanced_misc.php");
		Assert.assertEquals(driver.getTitle(), "Miscellaneous | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void settingsTunablesTitle() {
		driver.get(url+"system_advanced_sysctl.php");
		Assert.assertEquals(driver.getTitle(), "Tunables | Settings | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void trustAuthoritiesTitle() {
		driver.get(url+"system_camanager.php");
		Assert.assertEquals(driver.getTitle(), "Authorities | Trust | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void trustCertificatesTitle() {
		driver.get(url+"system_certmanager.php");
		Assert.assertEquals(driver.getTitle(), "Certificates | Trust | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void trustRevocationTitle() {
		driver.get(url+"system_crlmanager.php");
		Assert.assertEquals(driver.getTitle(), "Revocation | Trust | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void wizardTitle() {
		driver.get(url+"wizard.php?xml=system");
		Assert.assertEquals(driver.getTitle(), "General Setup | Wizard | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void logFilesAuditTitle() {
		driver.get(url+"ui/diagnostics/log/core/audit");
		Assert.assertEquals(driver.getTitle(), "Audit | Log Files | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void logFilesBackendTitle() {
		driver.get(url+"ui/diagnostics/log/core/configd");
		Assert.assertEquals(driver.getTitle(), "Backend | Log Files | System | OPNsense.localdomain");
	}
	

	@Test(groups={"title_check","regression"})
	public void logFilesBootTitle() {
		driver.get(url+"ui/diagnostics/log/core/boot");
		Assert.assertEquals(driver.getTitle(), "Boot | Log Files | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void logFilesGeneralTitle() {
		driver.get(url+"ui/diagnostics/log/core/system");
		Assert.assertEquals(driver.getTitle(), "General | Log Files | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void logFilesWebGUITitle() {
		driver.get(url+"ui/diagnostics/log/core/lighttpd");
		Assert.assertEquals(driver.getTitle(), "Web GUI | Log Files | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void diagnosticsActivityTitle() {
		driver.get(url+"ui/diagnostics/activity");
		Assert.assertEquals(driver.getTitle(), "Activity | Diagnostics | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void diagnosticsServicesTitle() {
		driver.get(url+"status_services.php");
		Assert.assertEquals(driver.getTitle(), "Services | Diagnostics | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void diagnosticsStatisticsTitle() {
		driver.get(url+"ui/diagnostics/system/memory#memory");
		Assert.assertEquals(driver.getTitle(), "Statistics | Diagnostics | System | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesLANTitle() {
		driver.get(url+"interfaces.php?if=lan");
		Assert.assertEquals(driver.getTitle(), "[LAN] | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesWANTitle() {
		driver.get(url+"interfaces.php?if=wan");
		Assert.assertEquals(driver.getTitle(), "[WAN] | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesAssignmentsTitle() {
		driver.get(url+"interfaces_assign.php");
		Assert.assertEquals(driver.getTitle(), "Assignments | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOverviewTitle() {
		driver.get(url+"status_interfaces.php");
		Assert.assertEquals(driver.getTitle(), "Overview | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesSettingsTitle() {
		driver.get(url+"system_advanced_network.php");
		Assert.assertEquals(driver.getTitle(), "Settings | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesSettingsVIPsTitle() {
		driver.get(url+"ui/interfaces/vip");
		Assert.assertEquals(driver.getTitle(), "Settings | Virtual IPs | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesStatusVIPsTitle() {
		driver.get(url+"ui/diagnostics/interface/vip");
		Assert.assertEquals(driver.getTitle(), "Status | Virtual IPs | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesWirelessDevicesTitle() {
		driver.get(url+"interfaces_wireless.php");
		Assert.assertEquals(driver.getTitle(), "Devices | Wireless | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesWirelessLogFileTitle() {
		driver.get(url+"ui/diagnostics/log/core/wireless");
		Assert.assertEquals(driver.getTitle(), "Log File | Wireless | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesPtPDevicesTitle() {
		driver.get(url+"interfaces_ppps.php");
		Assert.assertEquals(driver.getTitle(), "Devices | Point-to-Point | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesPtPLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/ppps");
		Assert.assertEquals(driver.getTitle(), "Log File | Point-to-Point | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesBridgeTitle() {
		driver.get(url+"interfaces_bridge.php");
		Assert.assertEquals(driver.getTitle(), "Bridge | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesGIFTitle() {
		driver.get(url+"interfaces_gif.php");
		Assert.assertEquals(driver.getTitle(), "GIF | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesGRETitle() {
		driver.get(url+"interfaces_gre.php");
		Assert.assertEquals(driver.getTitle(), "GRE | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesLAGGTitle() {
		driver.get(url+"interfaces_lagg.php");
		Assert.assertEquals(driver.getTitle(), "LAGG | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesLoopbackTitle() {
		driver.get(url+"ui/interfaces/loopback");
		Assert.assertEquals(driver.getTitle(), "Loopback | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesVLANTitle() {
		driver.get(url+"ui/interfaces/vlan");
		Assert.assertEquals(driver.getTitle(), "VLAN | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesOtherTypesVXLANTitle() {
		driver.get(url+"ui/interfaces/vxlan");
		Assert.assertEquals(driver.getTitle(), "VXLAN | Other Types | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsARPTitle() {
		driver.get(url+"ui/diagnostics/interface/arp");
		Assert.assertEquals(driver.getTitle(), "ARP Table | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsDNSTitle() {
		driver.get(url+"ui/diagnostics/dns_diagnostics");
		Assert.assertEquals(driver.getTitle(), "DNS Lookup | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsNDPTitle() {
		driver.get(url+"ui/diagnostics/interface/ndp");
		Assert.assertEquals(driver.getTitle(), "NDP Table | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsNetstatTitle() {
		driver.get(url+"ui/diagnostics/interface/netstat#interfaces");
		Assert.assertEquals(driver.getTitle(), "Netstat | Diagnostics | Interfaces | OPNsense.localdomain");
	}

	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsPacketCaptureTitle() {
		driver.get(url+"ui/diagnostics/packet_capture");
		Assert.assertEquals(driver.getTitle(), "Packet Capture | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsPingTitle() {
		driver.get(url+"diag_ping.php");
		Assert.assertEquals(driver.getTitle(), "Ping | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsPortProbeTitle() {
		driver.get(url+"diag_testport.php");
		Assert.assertEquals(driver.getTitle(), "Port Probe | Diagnostics | Interfaces | OPNsense.localdomain");
	}

	@Test(groups={"title_check","regression"})
	public void interfacesDiagnosticsTraceRouteTitle() {
		driver.get(url+"diag_traceroute.php");
		Assert.assertEquals(driver.getTitle(), "Trace Route | Diagnostics | Interfaces | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallAliasesTitle() {
		driver.get(url+"ui/firewall/alias");
		Assert.assertEquals(driver.getTitle(), "Aliases | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallCategoriesTitle() {
		driver.get(url+"ui/firewall/category");
		Assert.assertEquals(driver.getTitle(), "Categories | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallGroupsTitle() {
		driver.get(url+"interfaces_groups.php");
		Assert.assertEquals(driver.getTitle(), "Groups | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallPortNatTitle() {
		driver.get(url+"firewall_nat.php");
		Assert.assertEquals(driver.getTitle(), "Port Forward | NAT | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNat1t1Title() {
		driver.get(url+"firewall_nat_1to1.php");
		Assert.assertEquals(driver.getTitle(), "One-to-One | NAT | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNatOutboundTitle() {
		driver.get(url+"firewall_nat_out.php");
		Assert.assertEquals(driver.getTitle(), "Outbound | NAT | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNatNPTv6Title() {
		driver.get(url+"firewall_nat_npt.php");
		Assert.assertEquals(driver.getTitle(), "NPTv6 | NAT | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallFloatingTitle() {
		driver.get(url+"firewall_rules.php?if=FloatingRules");
		Assert.assertEquals(driver.getTitle(), "Floating | Rules | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLANTitle() {
		driver.get(url+"firewall_rules.php?if=lan");
		Assert.assertEquals(driver.getTitle(), "LAN | Rules | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLoopbackTitle() {
		driver.get(url+"firewall_rules.php?if=lo0");
		Assert.assertEquals(driver.getTitle(), "Loopback | Rules | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallWANTitle() {
		driver.get(url+"firewall_rules.php?if=wan");
		Assert.assertEquals(driver.getTitle(), "WAN | Rules | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallShaperTitle() {
		driver.get(url+"ui/trafficshaper#pipes");
		Assert.assertEquals(driver.getTitle(), "Shaper | Firewall | OPNsense.localdomain");
		
		driver.get(url+"ui/trafficshaper#queues");
		Assert.assertEquals(driver.getTitle(), "Shaper | Firewall | OPNsense.localdomain");
		
		driver.get(url+"ui/trafficshaper#rules");
		Assert.assertEquals(driver.getTitle(), "Shaper | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallShaperStatusTitle() {
		driver.get(url+"ui/trafficshaper/service/statistics");
		Assert.assertEquals(driver.getTitle(), "Status | Shaper | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallSettingsAdvancedTitle() {
		driver.get(url+"system_advanced_firewall.php");
		Assert.assertEquals(driver.getTitle(), "Advanced | Settings | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallSettingsNormalizationTitle() {
		driver.get(url+"firewall_scrub.php");
		Assert.assertEquals(driver.getTitle(), "Normalization | Settings | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallSettingsSchedulesTitle() {
		driver.get(url+"firewall_schedule.php");
		Assert.assertEquals(driver.getTitle(), "Schedules | Settings | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLogsGeneralTitle() {
		driver.get(url+"ui/diagnostics/log/core/firewall");
		Assert.assertEquals(driver.getTitle(), "General | Log Files | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLogsLiveTitle() {
		driver.get(url+"ui/diagnostics/firewall/log");
		Assert.assertEquals(driver.getTitle(), "Live View | Log Files | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLogsOverviewTitle() {
		driver.get(url+"ui/diagnostics/firewall/stats");
		Assert.assertEquals(driver.getTitle(), "Overview | Log Files | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallLogsPlainviewTitle() {
		driver.get(url+"ui/diagnostics/log/core/filter");
		Assert.assertEquals(driver.getTitle(), "Plain View | Log Files | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsAliasesTitle() {
		driver.get(url+"ui/firewall/alias_util/");
		Assert.assertEquals(driver.getTitle(), "Aliases | Diagnostics | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsSessionsTitle() {
		driver.get(url+"ui/diagnostics/firewall/pf_top");
		Assert.assertEquals(driver.getTitle(), "Sessions | Diagnostics | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsStatesTitle() {
		driver.get(url+"ui/diagnostics/firewall/states");
		Assert.assertEquals(driver.getTitle(), "States | Diagnostics | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsStatisticsTitle() {
		driver.get(url+"ui/diagnostics/firewall/statistics#info");
		Assert.assertEquals(driver.getTitle(), "Statistics | Diagnostics | Firewall | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecConnectionsTitle() {
		driver.get(url+"ui/ipsec/connections");
		Assert.assertEquals(driver.getTitle(), "Connections [new] | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecTunnelTitle() {
		driver.get(url+"ui/ipsec/tunnels");
		Assert.assertEquals(driver.getTitle(), "Tunnel Settings | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecMobileTitle() {
		driver.get(url+"vpn_ipsec_mobile.php");
		Assert.assertEquals(driver.getTitle(), "Mobile Clients | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecKeysTitle() {
		driver.get(url+"ui/ipsec/pre_shared_keys/");
		Assert.assertEquals(driver.getTitle(), "Pre-Shared Keys | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecKeysPairsTitle() {
		driver.get(url+"ui/ipsec/key-pairs");
		Assert.assertEquals(driver.getTitle(), "Key Pairs | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecAdvancedSettingsTitle() {
		driver.get(url+"vpn_ipsec_settings.php");
		Assert.assertEquals(driver.getTitle(), "Advanced Settings | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecStatusOverviewTitle() {
		driver.get(url+"ui/ipsec/sessions");
		Assert.assertEquals(driver.getTitle(), "Status Overview | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIPsecStatusLeaseTitle() {
		driver.get(url+"ui/ipsec/leases");
		Assert.assertEquals(driver.getTitle(), "Lease Status | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsSecurityAssociationDatabaseTitle() {
		driver.get(url+"ui/ipsec/sad");
		Assert.assertEquals(driver.getTitle(), "Security Association Database | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsSPDTitle() {
		driver.get(url+"ui/ipsec/spd");
		Assert.assertEquals(driver.getTitle(), "Security Policy Database | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsVTITitle() {
		driver.get(url+"ui/ipsec/vti");
		Assert.assertEquals(driver.getTitle(), "Virtual Tunnel Interfaces | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDiagnosticsLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/ipsec");
		Assert.assertEquals(driver.getTitle(), "Log File | IPsec | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNServersTitle() {
		driver.get(url+"vpn_openvpn_server.php");
		Assert.assertEquals(driver.getTitle(), "Servers | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNClientsTitle() {
		driver.get(url+"vpn_openvpn_client.php");
		Assert.assertEquals(driver.getTitle(), "Clients | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNCSOTitle() {
		driver.get(url+"vpn_openvpn_csc.php");
		Assert.assertEquals(driver.getTitle(), "Client Specific Overrides | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNClientExportTitle() {
		driver.get(url+"ui/openvpn/export");
		Assert.assertEquals(driver.getTitle(), "Client Export | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNConnectionStatusTitle() {
		driver.get(url+"status_openvpn.php");
		Assert.assertEquals(driver.getTitle(), "Connection Status | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallOpenVPNLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/openvpn");
		Assert.assertEquals(driver.getTitle(), "Log File | OpenVPN | VPN | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallCPortalAdministrationTitle() {
		driver.get(url+"ui/captiveportal");
		Assert.assertEquals(driver.getTitle(), "Administration | Captive Portal | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallCPortalSessionsTitle() {
		driver.get(url+"ui/captiveportal/session");
		Assert.assertEquals(driver.getTitle(), "Sessions | Captive Portal | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallCPortalVouchersTitle() {
		driver.get(url+"ui/captiveportal/voucher");
		Assert.assertEquals(driver.getTitle(), "Vouchers | Captive Portal | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallCPortalLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/portalauth");
		Assert.assertEquals(driver.getTitle(), "Log File | Captive Portal | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDHCPv4RelayTitle() {
		driver.get(url+"services_dhcp_relay.php");
		Assert.assertEquals(driver.getTitle(), "Relay | DHCPv4 | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDHCPv4LeasesTitle() {
		driver.get(url+"status_dhcp_leases.php");
		Assert.assertEquals(driver.getTitle(), "Leases | DHCPv4 | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDHCPv4LogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/dhcpd");
		Assert.assertEquals(driver.getTitle(), "Log File | DHCPv4 | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDHCPv6RelayTitle() {
		driver.get(url+"services_dhcpv6_relay.php");
		Assert.assertEquals(driver.getTitle(), "Relay | DHCPv6 | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDHCPv6LeasesTitle() {
		driver.get(url+"status_dhcpv6_leases.php");
		Assert.assertEquals(driver.getTitle(), "Leases | DHCPv6 | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDnsmasqDNSSettingsTitle() {
		driver.get(url+"services_dnsmasq.php");
		Assert.assertEquals(driver.getTitle(), "Settings | Dnsmasq DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallDnsmasqDNSLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/dnsmasq");
		Assert.assertEquals(driver.getTitle(), "Log File | Dnsmasq DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIntrusionDetectionAdministrationTitle() {
		driver.get(url+"ui/ids");
		Assert.assertEquals(driver.getTitle(), "Administration | Intrusion Detection | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIntrusionDetectionPolicyTitle() {
		driver.get(url+"ui/ids/policy");
		Assert.assertEquals(driver.getTitle(), "Policy | Intrusion Detection | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallIntrusionDetectionLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/suricata");
		Assert.assertEquals(driver.getTitle(), "Log File | Intrusion Detection | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallMonitSettingsTitle() {
		driver.get(url+"ui/monit");
		Assert.assertEquals(driver.getTitle(), "Settings | Monit | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallMonitStatusTitle() {
		driver.get(url+"ui/monit/status");
		Assert.assertEquals(driver.getTitle(), "Status | Monit | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallMonitLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/monit");
		Assert.assertEquals(driver.getTitle(), "Log File | Monit | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNetworkTimeGeneralTitle() {
		driver.get(url+"services_ntpd.php");
		Assert.assertEquals(driver.getTitle(), "General | Network Time | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNetworkTimeGPSTitle() {
		driver.get(url+"services_ntpd_gps.php");
		Assert.assertEquals(driver.getTitle(), "GPS | Network Time | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNetworkTimePPSTitle() {
		driver.get(url+"services_ntpd_pps.php");
		Assert.assertEquals(driver.getTitle(), "PPS | Network Time | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNetworkTimeStatusTitle() {
		driver.get(url+"status_ntpd.php");
		Assert.assertEquals(driver.getTitle(), "Status | Network Time | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallNetworkTimeLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/ntpd");
		Assert.assertEquals(driver.getTitle(), "Log File | Network Time | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallServicesOpenDNSTitle() {
		driver.get(url+"services_opendns.php");
		Assert.assertEquals(driver.getTitle(), "OpenDNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSGeneralTitle() {
		driver.get(url+"services_unbound.php");
		Assert.assertEquals(driver.getTitle(), "General | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSOverridesTitle() {
		driver.get(url+"ui/unbound/overrides/");
		Assert.assertEquals(driver.getTitle(), "Overrides | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSAdvancedTitle() {
		driver.get(url+"ui/unbound/advanced/");
		Assert.assertEquals(driver.getTitle(), "Advanced | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSAccessListsTitle() {
		driver.get(url+"services_unbound_acls.php");
		Assert.assertEquals(driver.getTitle(), "Access Lists | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSBlocklistTitle() {
		driver.get(url+"ui/unbound/dnsbl/index");
		Assert.assertEquals(driver.getTitle(), "Blocklist | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSQueryTitle() {
		driver.get(url+"ui/unbound/forward");
		Assert.assertEquals(driver.getTitle(), "Query Forwarding | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSDNSoverTLSTitle() {
		driver.get(url+"ui/unbound/dot");
		Assert.assertEquals(driver.getTitle(), "DNS over TLS | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSStatisticsTitle() {
		driver.get(url+"ui/unbound/stats");
		Assert.assertEquals(driver.getTitle(), "Statistics | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallUnboundDNSLogsTitle() {
		driver.get(url+"ui/diagnostics/log/core/resolver");
		Assert.assertEquals(driver.getTitle(), "Log File | Unbound DNS | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallWebProxyAdministrationTitle() {
		driver.get(url+"ui/proxy");
		Assert.assertEquals(driver.getTitle(), "Administration | Web Proxy | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallWebProxyCacheLogTitle() {
		driver.get(url+"ui/diagnostics/log/squid/cache");
		Assert.assertEquals(driver.getTitle(), "Cache Log | Web Proxy | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallWebProxyAccessLogTitle() {
		driver.get(url+"ui/diagnostics/log/squid/access");
		Assert.assertEquals(driver.getTitle(), "Access Log | Web Proxy | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void firewallWebProxyStoreLogTitle() {
		driver.get(url+"ui/diagnostics/log/squid/store");
		Assert.assertEquals(driver.getTitle(), "Store Log | Web Proxy | Services | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void powerRebootTitle() {
		driver.get(url+"ui/core/reboot");
		Assert.assertEquals(driver.getTitle(), "Reboot | Power | OPNsense.localdomain");
	}
	
	@Test(groups={"title_check","regression"})
	public void powerPowerOffTitle() {
		driver.get(url+"ui/core/halt");
		Assert.assertEquals(driver.getTitle(), "Power Off | Power | OPNsense.localdomain");
	}
	
}
