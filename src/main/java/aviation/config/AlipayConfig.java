package aviation.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101700707113";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCEkxH5sqYl0JYtkfJ0b0S9CQgZBVTbf2AJGD3IPCbi/370FKRyFvFkHh/EY8DI3xzSZIehEnxWlumj1+fofE6V5cOucmNV7NZtpWjxl3yqmbzVGfIilgsz2D1B9dpLw38MTUiBO/WA2VIjP/kdmMExU/W6PHCADMLPka9uuqXwZhlMJiiUOBHNIhCcYQnj/Y8AMSxfQKL2xVRmLScto3odSUzgGg0GsjOYcXoM24jd2QTLigfUlBIS6XWaGEbJLSmBrsHEhcEuUCPhG4m+gESc3uPmcxf9WD3aPLzu69Ruw66ap56hlp8IzT6NPtWheKkv8AyNH5nM0M5Vr74z5PNvAgMBAAECggEAGZ866CFIzyIjBCeizjH6/PXT5NIM9mcFrnxK5HoLoe9zH8Uliw84E/tmdFQ7HBdSwK7BL7Yc5bdA7HN71IjBv2KqkPp2jFK7lnFTeO2oIGiaAC2FiH2rKJfwLuFPETl1QnFlQ+TMq9xUbY+dm8S8AcaSRS4NKBJPTEKBv0q/a1hm92tX7S3Gtd2n0B/suiS5RV6Jmq2kzb7VHMD1WoSzUg7V2bKzRU3ane1IjFg1Yeisc5rnsp3CMTcVmWpuaDnkPs8mDIovsakT8p9lXnUNOFlAVW81E9JLUb9gaBv7Oyb46Jr7x/ORheDbuGZxMfWT3nOnXebDvuknkprzxnTQUQKBgQDpDSYXMtjkYlZg2Fuj0tcM6Nt4tjKDiKZbISfXXem2U6iORcR6CFTIsVVG/ciWEKwyg25Nbqaa5sy2cnwHgaast1YjxoogwOeyXd5hN4yPOp7NjPnAbprt+9OrrhbGX9+QuQ8APKkvtZsipI3BNARpMhUj3LGK3DTB2GIXNe5opQKBgQCRoQ+F1DhVPcG/vMAORDdLrf7vGSnxw6nuZ3W5+SiHDoF/0JyJp+CC9YC46FVULbRaYYHPjJVJRbb8LwHVjzri908ZsX9ccE2HjKFeF0EVw8gtqOoxdUkc2pi5JB+62Cdriu5ZNhcU1CNSfseaiyZG8Z3VS4fvswbgoppy26wbgwKBgQCqVW3trsBPzIANsJTqHAQJ73fZtnEdKhdMq+MOyhkzpdmgguWju8scFGCbzol5BR6WnPFVrvYeaWpePzbf1acYvbc71rTGU7gE6g7LR2p4lQPUgKFaQH0ES/bdmBQVUaV5hYitR6jwse99VoA1IevHZ0+EMp2hPGli9OBczpI98QKBgBhgV1LVdSB/l+DaXWOF86ONWnD3S1gWomkvlDsvA6Onv/F/H9TC7we8xHEvIqlWhSvjynDNXWfIbZrE24+9y+OV9f2dAm6ctb2Mwq4XQmO8Q9OwxJLGyRg1Vv8WluEVsXOE6+Su8yofYFI8uniZ9ixF4V+EpxpuYyZS0XuMXcC1AoGAXKJ063H3mVvVuGmwRYBAViVBIaFBMgePvA6Emfe9WFbWiNHxwLBqOIBQ7VWXyBQZrQw3uJPl8D8BRC4VUVCevjzWYAnSZV46qKDv+WKQiEpoDs+EYa7Zky8g1LBsb5VmXYHVvTqAI383YoXDie0KeCDr9z3yI24ArcBoyXDBWyg=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlnncDtZWuq0YpyRwVe1vHEb3F60QzX4cOqBXeSqYEdkzbr5MHTUqDypWgfB+Rk0DBw02Ga8cjCVSDtvjxd1UpwwggOaTI2rDFDImORD4LFWaRY5kNANaqruIE+GMYB6/yyIdt0OAjp+hkakqahjejEyyjY7PUpXp0QsXmGriEF5Pxn3jceZ36lFPzWQCiDgoGVNAvNSDDlOXpxlE8/+kj8TWjBGK/ffQhtu1VIdf0xlGikK6SCcgZtXCjAx1WR/65HYdx8Ere/Newo3XLQo+5Sv5NG64eeKTCmXxUqzcAf86W+nsqmxadoVk466GQaNQr2ld0x+dmDeA8y7G48FlewIDAQAB";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = " http://airsyssunnys.free.idcfengye.com/aviation/reception/index";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


