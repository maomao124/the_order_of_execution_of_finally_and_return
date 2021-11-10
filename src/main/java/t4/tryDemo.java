package t4;

/**
 * Project name(项目名称)：finally与return的执行顺序
 * Package(包名): t4
 * Class(类名): tryDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:25
 * Version(版本): 1.0
 * Description(描述)： 在 finally 代码块中改变返回值并不会改变最后返回的内容。
 */

public class tryDemo
{
    public static int show()
    {
        int result = 0;
        try
        {
            return result;
        }
        finally
        {
            System.out.println("执行finally模块");
            result = 1;
            System.out.println(result);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("finally 中改变返回值:");
        System.out.println("变量的值：" + show());
    }
}
