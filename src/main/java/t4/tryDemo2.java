package t4;

/**
 * Project name(项目名称)：finally与return的执行顺序
 * Package(包名): t4
 * Class(类名): tryDemo2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/10
 * Time(创建时间)： 13:29
 * Version(版本): 1.0
 * Description(描述)： 返回值类型是引用类型
 * 当 try 代码块或 catch 代码块中的 return 返回值类型为普通变量或引用变量时，
 * 即使在后面 finally 代码块中对返回值的变量重新赋值，也不会影响最后返回的值。
 */

public class tryDemo2
{
    public static Object show()
    {
        Object obj = new Object();
        try
        {
            return obj;
        }
        finally
        {
            System.out.println("执行finally模块");
            obj = null;
            System.out.println(obj);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("返回值类型是引用类型:");
        System.out.println("返回：" + show());
    }
}
