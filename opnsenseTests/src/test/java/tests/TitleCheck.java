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
}
