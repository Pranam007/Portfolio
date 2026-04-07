package com.portfolio.app.model;

import java.util.List;

public class PortfolioData {
    private String name;
    private String title;
    private String subtitle;
    private String about;
    private String email;
    private String github;
    private String linkedin;
    private String location;
    private List<Skill> skills;
    private List<Project> projects;
    private List<Experience> experiences;

    public PortfolioData() {}

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getSubtitle() { return subtitle; }
    public void setSubtitle(String subtitle) { this.subtitle = subtitle; }
    public String getAbout() { return about; }
    public void setAbout(String about) { this.about = about; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    public String getLinkedin() { return linkedin; }
    public void setLinkedin(String linkedin) { this.linkedin = linkedin; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public List<Skill> getSkills() { return skills; }
    public void setSkills(List<Skill> skills) { this.skills = skills; }
    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
    public List<Experience> getExperiences() { return experiences; }
    public void setExperiences(List<Experience> experiences) { this.experiences = experiences; }

    public static class Skill {
        private String name;
        private int level;
        private String category;
        private String icon;

        public Skill(String name, int level, String category, String icon) {
            this.name = name;
            this.level = level;
            this.category = category;
            this.icon = icon;
        }
        public String getName() { return name; }
        public int getLevel() { return level; }
        public String getCategory() { return category; }
        public String getIcon() { return icon; }
    }

    public static class Project {
        private String title;
        private String description;
        private List<String> tags;
        private String githubUrl;
        private String liveUrl;
        private String emoji;

        public Project(String title, String description, List<String> tags, String githubUrl, String liveUrl, String emoji) {
            this.title = title;
            this.description = description;
            this.tags = tags;
            this.githubUrl = githubUrl;
            this.liveUrl = liveUrl;
            this.emoji = emoji;
        }
        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public List<String> getTags() { return tags; }
        public String getGithubUrl() { return githubUrl; }
        public String getLiveUrl() { return liveUrl; }
        public String getEmoji() { return emoji; }
    }

    public static class Experience {
        private String company;
        private String role;
        private String duration;
        private String description;
        private String icon;

        public Experience(String company, String role, String duration, String description, String icon) {
            this.company = company;
            this.role = role;
            this.duration = duration;
            this.description = description;
            this.icon = icon;
        }
        public String getCompany() { return company; }
        public String getRole() { return role; }
        public String getDuration() { return duration; }
        public String getDescription() { return description; }
        public String getIcon() { return icon; }
    }
}
