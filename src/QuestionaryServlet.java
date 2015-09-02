
import analyzer.Sample;
import analyzer.StatAnalyzer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Viktor Bezditnyi
 */
public class QuestionaryServlet extends HttpServlet{

    static final String TEMPLATE = "<html>" +
            "<head><title>Statistics</title></head>" +
            "<body><h1>Current statistics</h1><h2>Male: %d</h2><p>%s</p><h2>Female: %d</h2><p>%s</p></body></html>";

    private StatAnalyzer stat = new StatAnalyzer();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        stat.add(
                new Sample(req.getParameter("firstName")
                        , req.getParameter("lastName")
                        , req.getParameter("sex")
                        , req.getParameter("browser"))
        );

        resp.getWriter().println(String.format(TEMPLATE,
                stat.countMale(),
                stat.showMaleStat(),
                stat.countFemale(),
                stat.showFemaleStat())
        );
    }
}
