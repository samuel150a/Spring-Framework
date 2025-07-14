package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/quiz")
public class QuizServlet extends HttpServlet {

    private final String[] questions = {
            "What is the capital of France?",
            "Which language runs in a web browser?",
            "What is 2 + 2?",
            "What color is the sky?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Hamlet'?",
            "Which is a Java keyword?",
            "What is the boiling point of water?",
            "Which number is even?",
            "Which is not a programming language?"
    };

    private final String[][] options = {
            {"A. Paris", "B. London", "C. Rome", "D. Berlin"},
            {"A. Java", "B. C", "C. Python", "D. JavaScript"},
            {"A. 3", "B. 4", "C. 5", "D. 6"},
            {"A. Blue", "B. Green", "C. Red", "D. Yellow"},
            {"A. Earth", "B. Saturn", "C. Mars", "D. Venus"},
            {"A. Shakespeare", "B. Dante", "C. Homer", "D. Plato"},
            {"A. print", "B. loop", "C. class", "D. define"},
            {"A. 50°C", "B. 80°C", "C. 100°C", "D. 150°C"},
            {"A. 3", "B. 5", "C. 7", "D. 8"},
            {"A. Java", "B. HTML", "C. C++", "D. Paint"}
    };

    private final String[] correctAnswers = {"A", "D", "B", "A", "C", "A", "C", "C", "D", "D"};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("question", questions[0]);
        req.setAttribute("options", options[0]);
        req.setAttribute("qIndex", 0);
        req.setAttribute("isLast", false);
        req.setAttribute("isResult", false);
        req.getRequestDispatcher("quiz.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String qIndexStr = req.getParameter("qIndex");
        int qIndex = -1;
        if (qIndexStr != null && !qIndexStr.isEmpty()) {
            try {
                qIndex = Integer.parseInt(qIndexStr);
            } catch (NumberFormatException e) {
                qIndex = -1;
            }
        }

        String selected = req.getParameter("choice");
        if (selected != null) {
            session.setAttribute("answer" + qIndex, selected);
        }

        qIndex++;

        if (qIndex  < questions.length) {
            req.setAttribute("question", questions[qIndex]);
            req.setAttribute("options", options[qIndex]);
            req.setAttribute("qIndex", qIndex);
            req.setAttribute("isLast", (qIndex == questions.length - 1));
            req.setAttribute("isResult", false);
        } else {
            int score = 0;
            StringBuilder resultHTML = new StringBuilder();

            for (int i = 0; i < questions.length; i++) {
                String userAnswer = (String) session.getAttribute("answer" + i);
                String correct = correctAnswers[i];
                boolean isCorrect = correct.equals(userAnswer);

                resultHTML.append("<div>");
                resultHTML.append("<strong>Q").append(i + 1).append(": ").append(questions[i]).append("</strong><br>");
                resultHTML.append("Your Answer: <span class='")
                        .append(isCorrect ? "correct" : "wrong")
                        .append("'>")
                        .append(userAnswer != null ? userAnswer : "No Answer")
                        .append("</span><br>");
                resultHTML.append("Correct Answer: <strong>").append(correct).append("</strong><br><br>");
                resultHTML.append("</div>");

                if (isCorrect) {
                    score++;
                }
            }

            req.setAttribute("isResult", true);
            req.setAttribute("resultHTML", resultHTML.toString());
            req.setAttribute("score", score);
            req.setAttribute("total", questions.length);
        }

        req.getRequestDispatcher("quiz.jsp").forward(req, resp);
    }
}
