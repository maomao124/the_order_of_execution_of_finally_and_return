package t1;

/**
 * Project name(项目名称)：finally与return的执行顺序
 * Package(包名): t1
 * Class(类名): tryDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:12
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class tryDemo
{
    public static int show()
    {
        try
        {
            return 1;
        }
        finally
        {
            System.out.println("执行finally模块");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("try 中带有 return:");
        System.out.println("返回值：" + show());
    }
}
