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
		Assert.assertEquals(driver.getTitle(), "Groups | Access | System | OPNsense.localdomain");
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

}
