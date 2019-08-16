import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 公司：赛安服
 * 文件名：HelloWord
 * 作者：Administratora
 * 时间：2019/8/15 11:11
 * 描述：
 */


public class HelloWord implements Serializable {

    private static final long serialVersionUID = -1374110609723628222L;
    List list = new ArrayList();

    public static void text(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
        helloWord.list.add(1);
        helloWord.list.add(2);
        helloWord.list.add(3);
        helloWord.list.add(4);
        HelloWord.text(helloWord.list);

    }
}
