package lab2;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  String driverPath = System.getProperty("user.dir") + "/src/lab2/geckodriver";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @Test
  public void testStudentList() throws Exception {
	String[] sid= {"3016218051",
	              "3016218052",
	              "3016218053",
	              "3016218054",
	              "3016218055",
	              "3016218056",
	              "3016218057",
	              "3016218058",
	              "3016218059",
	              "3016218060",
	              "3016218061",
	              "3016218062",
	              "3016218063",
	              "3016218064",
	              "3016218065",
	              "3016218066",
	              "3016218067",
	              "3016218068",
	              "3016218069",
	              "3016218070",
	              "3016218072",
	              "3016218073",
	              "3016218075",
	              "3016218076",
	              "3016218077",
	              "3016218078",
	              "3016230028",
	              "3016204130",
	              "3016218079",
	              "3016218080",
	              "3016218081",
	              "3016218083",
	              "3016218084",
	              "3016218085",
	              "3016218086",
	              "3016218087",
	              "3016218088",
	              "3016218089",
	              "3016218090",
	              "3016218091",
	              "3016218092",
	              "3016218093",
	              "3016218094",
	              "3016218096",
	              "3016218097",
	              "3016218098",
	              "3016218099",
	              "3016218100",
	              "3016218101",
	              "3016218102",
	              "3016218103",
	              "3016218104",
	              "3016218105",
	              "3016218106",
	              "3016218107",
	              "3016204310",
	              "3016207516",
	              "3016218108",
	              "3016218109",
	              "3016218110",
	              "3016218111",
	              "3016218112",
	              "3016218113",
	              "3016218114",
	              "3016218115",
	              "3016218116",
	              "3016218117",
	              "3016218118",
	              "3016218119",
	              "3016218120",
	              "3016218121",
	              "3016218122",
	              "3016218123",
	              "3016218124",
	              "3016218125",
	              "3016218126",
	              "3016218127",
	              "3016218128",
	              "3016218129",
	              "3016218130",
	              "3016218131",
	              "3016218133",
	              "3016218134",
	              "3016218135",
	              "3014218120",
	              "3016218136",
	              "3016218137",
	              "3016218138",
	              "3016218139",
	              "3016218140",
	              "3016218141",
	              "3016218142",
	              "3016218143",
	              "3016218144",
	              "3016218145",
	              "3016218146",
	              "3016218147",
	              "3016218148",
	              "3016218149",
	              "3016218150",
	              "3016218151",
	              "3016218152",
	              "3016218153",
	              "3016218154",
	              "3016218155",
	              "3016218156",
	              "3016218157",
	              "3016218158",
	              "3016218159",
	              "3016218160",
	              "3016218161",
	              "3016218162",
	              "3016218163",
	              "3016218164",
	              "3016207275",
	              "3016214077",
	              "3016218165",
	              "3016218166",
	              "3016218167",
	              "3016218168",
	              "3016218169",
	              "3016218170",
	              "3016218171",
	              "3016218172",
	              "3016218173",
	              "3016218174",
	              "3016218175",
	              "3016218176",
	              "3016218177",
	              "3016218178",
	              "3016218179",
	              "3016218180",
	              "3016218181",
	              "3016218182",
	              "3016218183",
	              "3016218184",
	              "3016218186",
	              "3016218187",
	              "3016218188",
	              "3016218189",
	              "3016218190",
	              "3016218191",
	              "3016218192"};
	String[] sname= {
			"�˽�",
			"��С�",
			"����ˮ",
			"����Ⱥ",
			"������",
			"���",
			"���",
			"�",
			"���ǿ�",
			"������",
			"����ɭ",
			"¥��",
			"������",
			"ʯ���",
			"����",
			"���Ӻ�",
			"����",
			"����",
			"����",
			"�Ľ���",
			"����Ÿ",
			"�����",
			"����Զ",
			"�Ŵ�",
			"�ſ���",
			"�����",
			"����ϼ",
			"����",
			"������",
			"������",
			"�½�",
			"���B",
			"����ܲ",
			"������",
			"�����",
			"������",
			"��־��",
			"������",
			"������",
			"¬�",
			"����",
			"ŷ�����",
			"������",
			"������",
			"������",
			"����",
			"��һ��",
			"κ��",
			"������",
			"�ų���",
			"�ſ�",
			"��ε��",
			"��ӱ��",
			"�Լ��",
			"����",
			"�����",
			"�����",
			"����",
			"��ŵ",
			"��ɭ��",
			"���Ӻ�",
			"�޸�",
			"������",
			"��̹",
			"����",
			"������",
			"�����",
			"����ʢ",
			"������",
			"���Ÿ�",
			"��Ȼ",
			"������",
			"�����",
			"�Ϸ���",
			"������",
			"������",
			"������",
			"Фҵ��",
			"���躭",
			"����",
			"�ż���",
			"�Խ�",
			"������",
			"����",
			"����",
			"���κ϶�����ľ��",
			"���ַ�",
			"����",
			"���",
			"��𩻪",
			"�����",
			"��ɯ���ᡤ����������",
			"�����",
			"�����",
			"������",
			"������",
			"������",
			"����",
			"¦����",
			"����",
			"�˷���",
			"ʯ����",
			"ʷ����",
			"ʷ��",
			"����",
			"̷����",
			"����",
			"����",
			"�Ż���",
			"�Ż�",
			"������",
			"��ݼ��",
			"����ع",
			"ף����",
			"���",
			"������",
			"���ι�������������",
			"�����",
			"������",
			"����",
			"���",
			"�ƶ�÷",
			"������",
			"������",
			"������",
			"���ĺ�",
			"����",
			"Ī����",
			"������",
			"������",
			"������",
			"������",
			"���",
			"��־��",
			"����",
			"л����",
			"Ҷ����",
			"�������������������",
			"������",
			"������",
			"������",
			"ף��Ԫ",
			"�����"
	};
	String [] sgit= {
			"https://github.com/popboykingdjko",
			"https://github.com/xiaoxuaoj",
			"https://github.com/nbdfls",
			"https://github.com/hyqzz1",
			"",
			"https://github.com/FBIbaby",
			"https://github.com/riginAI/test",
			"https://github.com/likai3016218058",
			"https://github.com/forAragaki/Software-Testing.git",
			"https://github.com/liuchongwei1998",
			"https://github.com/liuyuesen",
			"https://github.com/loulin206",
			"https://github.com/acan777",
			"https://github.com/Winbeeone/Hello-GitHub",
			"https://github.com/tangsongTJU",
			"https://github.com/LITTLEEEEE/st.git",
			"https://github.com/WangChen0902",
			"https://github.com/skye0207",
			"https://github.com/wanglei201810/HHH.git",
			"",
			"https://github.com/Panda216",
			"https://github.com/AQITF/software-testing-course",
			"https://github.com/Tyrusmacv",
			"https://github.com/Tyrusmacv",
			"https://github.com/DanielKZhang",
			"https://gitee.com/zqfgly",
			"https://github.com/XiaZiXia",
			"",
			"",
			"https://github.com/cyytju",
			"",
			"https://github.com/HaoFuTju",
			"https://github.com/Ziyiiii",
			"https://github.com/guopeiming",
			"",
			"https://github.com/brightknight177",
			"https://github.com/zhijielee",
			"https://github.com/guguguzi",
			"https://github.com/EchoLiuYinan",
			"https://github.com/iiTachi/",
			"",
			"https://github.com/SouperO",
			"https://github.com/qyhxxx",
			"https://github.com/SunCubeIsMyID",
			"https://github.com/passerw",
			"https://github.com/old-yellow",
			"https://github.com/yibowang98",
			"https://github.com/Landy0524",
			"https://github.com/nkaccounting",
			"https://github.com/PlatinumYi",
			"https://github.com/zk990202",
			"https://github.com/Zwh0508",
			"https://github.com/newyingyi",
			"https://github.com/uareagay",
			"https://github.com/LeilaniZ",
			"https://github.com/hshsilver/softwaretest",
			"",
			"https://github.com/Barbra0613",
			"https://github.com/Nicole1772",
			"https://github.com/csl784513390",
			"https://github.com/czhxbz",
			"https://github.com/whyNotwh",
			"https://github.com/tjugwt",
			"https://github.com/tjugwt",
			"https://github.com/BoHuyyy",
			"https://github.com/mangoSteve",
			"https://github.com/mangoSteve",
			"https://github.com/AndrewJYS",
			"https://github.com/liphcpp",
			"https://github.com/tju-lzg",
			"https://github.com/Nfboys",
			"https://github.com/tcklll/software-testing.git",
			"https://github.com/MHYpony",
			"https://github.com/FANBoMeng3016218124/swTest.git",
			"https://github.com/tjwhm",
			"https://github.com/hnwyx/software-testing",
			"https://github.com/wwwwangyiting",
			"https://github.com/HNSHongTian/SoftwareTesting",
			"https://github.com/linghanxu-tju/software_testing.git",
			"https://github.com/YWlancer",
			"https://github.com/oikawamomo/software_test",
			"https://github.com/ZJ921",
			"https://github.com/zzzyyyrrr",
			"https://github.com/tjudoubi",
			"https://github.com/SoSoSorry",
			"https://github.com/users/azzr997/projects/1",
			"https://github.com/SryTo/SoftwareTesting.git",
			"https://github.com/STHARUKI",
			"https://github.com/skadoodleR",
			"https://github.com/Potmon/STT2016.git",
			"https://github.com/everlastingstars",
			"https://github.com/Lothric19",
			"https://github.com/bxsj/",
			"https://github.com/0-Avalon-0",
			"https://github.com/mssjliwenxu",
			"https://github.com/MaoMaoChina",
			"https://github.com/LiuChunY",
			"https://github.com/liuzhidemaomao",
			"https://github.com/Lou11300306?tab=projects",
			"https://github.com/Horsepower8888",
			"https://github.com/Skypfx/softwareTesting",
			"https://github.com/colindying",
			"https://github.com/htmmd27",
			"https://github.com/tjuspAIC/Software-Testing",
			"https://github.com/Vincent-Sun",
			"https://github.com/980801",
			"https://github.com/ChenHsing",
			"https://github.com/yangmeng19980420",
			"https://github.com/Ives66",
			"https://github.com/zhuang12/SoftwareTest.git",
			"https://github.com/michellezyw",
			"https://github.com/Cyphexl",
			"https://github.com/lazygirlyu/homework",
			"https://github.com/GZhuJJ/SoftwareTestingCourse",
			"https://github.com/Lzhaohui",
			"https://github.com/ZhaoMingYang-tju",
			"https://github.com/azhar241892",
			"https://github.com/husuhusuhusu",
			"https://github.com/DemonTimor",
			"https://github.com/JoHnHC",
			"https://github.com/ritian-hh",
			"https://github.com/hdm926",
			"https://github.com/AWenXiong",
			"https://github.com/SSFDLware/software-testing",
			"https://github.com/yangyi66",
			"https://gitee.com/tju_hei/software_test.git",
			"https://github.com/liuyang806",
			"mcyatom@gmail.com",
			"https://github.com/ElegantQiu",
			"https://github.com/sqq7777",
			"https://github.com/suimingben",
			"https://github.com/sqis777?tab=repositories",
			"https://culturepanda.github.io/SoftwareTesting/",
			"https://github.com/YourBrotherTT/softwareTesting.git",
			"https://github.com/guuuuji/Software-test.git",
			"https://github.com/fallentree",
			"https://github.com/MarcusNerva",
			"https://github.com/ilgarrr",
			"https://github.com/githaub/homework.git",
			"https://github.com/llmgpty/tjuscsst.git",
			"https://github.com/ZhonglinZ",
			"https://github.com/ZHUKAIYUAN0/test",
			"https://github.com/jianxin-YL"
	};
    driver.get(baseUrl + "/");
    for(int i=0;i<143;i++) {
    	String sid_now=sid[i];
    	String spassword_now = sid[i].substring(4,10);

    	String sname_now = sname[i];
    	String sgit_now = sgit[i];
    	
    	WebElement we = driver.findElement(By.name("id"));
        we.click();
        driver.findElement(By.name("id")).clear();
        driver.findElement(By.name("id")).sendKeys(sid_now);
        
        WebElement we2 = driver.findElement(By.name("password"));
        we2.click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(spassword_now);
        
        driver.findElement(By.id("btn_login")).click();

        assertEquals(sid_now, driver.findElement(By.id("student-id")).getText());//.getText()����Ҫ�õ��ı����ݡ�
        assertEquals(sname_now, driver.findElement(By.id("student-name")).getText());
        assertEquals(sgit_now, driver.findElement(By.id("student-git")).getText());
        
        WebElement we3 = driver.findElement(By.id("btn_logout"));
        we3.click();
       
        WebElement we4 = driver.findElement(By.id("btn_return"));
        we4.click();
      }
    }


  @After
  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
