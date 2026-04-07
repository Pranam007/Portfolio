package com.portfolio.app.controller;

import com.portfolio.app.model.PortfolioData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String index(Model model) {
        PortfolioData data = buildPortfolioData();
        model.addAttribute("portfolio", data);
        return "index";
    }

    private PortfolioData buildPortfolioData() {
        PortfolioData data = new PortfolioData();

        // ── PERSONAL INFO ── Edit these!
        data.setName("Pranam Bhavsar");
        data.setTitle("Java Full-Stack Developer");
        data.setSubtitle("Building the future, one commit at a time");
        data.setEmail("pranambhavsar15@gmail.com");
        data.setGithub("https://github.com/Pranam007");
        data.setLinkedin("https://www.linkedin.com/in/pranam-bhavsar/");
        data.setLocation("Visnagar, Mehsana, Gujrat");
        data.setAbout(
                "I'm an aspiring Java Full-Stack Developer on an exciting journey to master the craft of " +
                        "building real-world web applications. With a growing foundation in Java, Spring Boot, and " +
                        "modern front-end technologies, I channel my passion into hands-on projects that push me to " +
                        "learn and grow every single day. I believe the best way to learn is by building — so I build. " +
                        "Currently seeking my first professional opportunity to contribute, collaborate, and grow."
        );

        // ── SKILLS ──
        data.setSkills(Arrays.asList(
                new PortfolioData.Skill("Java", 90, "Backend", "☕"),
                new PortfolioData.Skill("Spring Boot", 85, "Backend", "🍃"),
                new PortfolioData.Skill("Hibernate", 75, "Backend", "🗄️"),
                new PortfolioData.Skill("REST API", 90, "Backend", "🔌"),
                new PortfolioData.Skill("HTML", 80, "Frontend", "🌐"),
                new PortfolioData.Skill("CSS", 80, "Frontend", "🎨"),
                new PortfolioData.Skill("MySQL", 85, "Database", "🐬"),
                new PortfolioData.Skill("SQL", 90, "Database", "📊"),
                new PortfolioData.Skill("DBMS", 85, "Database", "🗃️"),
                new PortfolioData.Skill("Selenium", 75  , "Testing", "🧪"),
                new PortfolioData.Skill("Git", 72, "Tools", "🔧"),
                new PortfolioData.Skill("GitHub", 72, "Tools", "🐙")
        ));

        // ── PROJECTS ──
        data.setProjects(Arrays.asList(
                new PortfolioData.Project(
                        "Student Management System",
                        "A robust web application that performs full CRUD (Create, Read, Update, Delete) operations on student records. Built with a clean UI and structured backend for managing student data efficiently.",
                        Arrays.asList("Java", "Spring Boot", "MySQL", "Thymeleaf"),
                        "https://github.com/Pranam007/Student-Management-System",
                        "",
                        "🎓"
                ),
                new PortfolioData.Project(
                        "Weather API Application",
                        "A RESTful Weather API that fetches real-time weather data by city using OpenWeatherMap API. Features designed endpoints, error handling, JSON responses, and a simple HTML/CSS frontend to display live weather info.",
                        Arrays.asList("Java", "Spring Boot", "REST API", "OpenWeatherMap", "HTML", "CSS"),
                        "https://github.com/Pranam007/Weather-API-Application",
                        "",
                        "🌤️"
                )
        ));

        // ── EXPERIENCE ──
        data.setExperiences(Arrays.asList(
                new PortfolioData.Experience(
                        "Java Core",
                        "Completed ✅",
                        "2024",
                        "Mastered Java fundamentals including OOP, Collections, Exception Handling, and core programming concepts that form the backbone of all my projects.",
                        "☕"
                ),
                new PortfolioData.Experience(
                        "Spring Boot Basics",
                        "Completed ✅",
                        "2025",
                        "Built REST APIs, worked with Hibernate & MySQL, created MVC applications using Thymeleaf. Applied knowledge in 2 real-world projects.",
                        "🍃"
                ),
                new PortfolioData.Experience(
                        "2 Projects Shipped",
                        "Completed ✅",
                        "2025",
                        "Built a Student Management System with full CRUD operations and a Weather API Application integrated with OpenWeatherMap — both from scratch.",
                        "🔨"
                ),
                new PortfolioData.Experience(
                        "Contribute to Live Projects",
                        "Current Goal 🎯",
                        "2026",
                        "Actively seeking opportunities to contribute my Java & Spring Boot skills to real-world projects, internships, or open source — ready to learn, collaborate and grow.",
                        "🚀"
                )
        ));

        return data;
    }
}
