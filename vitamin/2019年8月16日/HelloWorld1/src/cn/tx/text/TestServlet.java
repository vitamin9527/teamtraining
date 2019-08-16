/**
 * 公司：赛安服
 * 文件名：demo
 * 作者：Administratora
 * 时间：2019/8/15 13:07
 * 描述：
 */


package cn.tx.text;

import org.apache.zookeeper.ZooKeeper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("启动中");

    }

}
