package control;

import bll.NewsManage;
import entity.News;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PublishControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        News news = new News();
        news.setTitle(request.getParameter("title"));
        news.setPublishTime(request.getParameter("publishTime"));
        news.setNewsType(request.getParameter("newType"));
        news.setContent(request.getParameter("content"));
        news.setFroms(request.getParameter("froms"));

        boolean result = new NewsManage().publish(news);
        if (result) {
            request.setAttribute("news", news);
            request.getRequestDispatcher("showNews.jsp").forward(request,response);
        } else {
            out.print("发布失败!");
        }

        out.close();
    }
}
