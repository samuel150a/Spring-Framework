<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deekshith M | Java Backend Developer</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=JetBrains+Mono:wght@400;700&display=swap" rel="stylesheet">
    <style>
        :root {
            --primary: #6c63ff;
            --primary-dark: #564fd8;
            --dark: #121212;
            --dark-light: #1e1e1e;
            --light: #f8f9fa;
            --gray: #6c757d;
            --transition: all 0.4s cubic-bezier(0.68, -0.55, 0.27, 1.55);
        }
        .navbar {
            padding: 1rem 0;
            background: rgba(18, 18, 18, 0.8) !important;
            backdrop-filter: blur(10px);
            transition: var(--transition);
        }

        .light-mode .navbar {
            background: rgba(255, 255, 255, 0.9) !important;
            box-shadow: 0 2px 20px rgba(0, 0, 0, 0.1);
        }

        .light-mode .navbar-brand,
        .light-mode .nav-link {
            color: var(--dark) !important;
        }

        .light-mode .nav-link:hover,
        .light-mode .nav-link.active {
            color: var(--primary) !important;
        }

        .light-mode .navbar-toggler {
            color: var(--dark);
            border-color: var(--dark);
        }

        /* Base Styles */
        body {
            font-family: 'Poppins', sans-serif;
            background-color: var(--dark-light);
            color: var(--light);
            overflow-x: hidden;
            transition: var(--transition);
        }

        body.light-mode {
            background-color: #f5f5f5;
            color: var(--dark);
        }

        ::selection {
            background: var(--primary);
            color: white;
        }

        /* Typography */
        h1, h2, h3, h4 {
            font-weight: 700;
            letter-spacing: -0.5px;
        }

        h2 {
            position: relative;
            display: inline-block;
            margin-bottom: 3rem;
        }

        h2::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 0;
            width: 50px;
            height: 4px;
            background: var(--primary);
            border-radius: 2px;
        }

        .text-mono {
            font-family: 'JetBrains Mono', monospace;
        }

        /* Navbar */
        .navbar {
            padding: 1rem 0;
            background: rgba(18, 18, 18, 0.8) !important;
            backdrop-filter: blur(10px);
            transition: var(--transition);
        }

        .light-mode .navbar {
            background: rgba(255, 255, 255, 0.9) !important;
            box-shadow: 0 2px 20px rgba(0, 0, 0, 0.1);
        }

        .nav-link {
            margin: 0 0.5rem;
            font-weight: 500;
            position: relative;
        }

        .nav-link::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 0;
            height: 2px;
            background: var(--primary);
            transition: var(--transition);
        }

        .nav-link:hover::after {
            width: 100%;
        }

        /* Hero Section */
        #hero {
            min-height: 100vh;
            padding-top: 80px;
            position: relative;
            overflow: hidden;
        }

        .hero-bg {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: linear-gradient(135deg, var(--dark), var(--dark-light));
            z-index: -2;
        }

        .light-mode #hero .hero-bg {
            background: linear-gradient(135deg, #e0e0e0, #f5f5f5);
        }

        .hero-content {
            position: relative;
            z-index: 1;
        }

        .hero-title {
            font-size: 4rem;
            line-height: 1.1;
            margin-bottom: 1.5rem;
        }

        .hero-subtitle {
            color: var(--primary);
            font-weight: 600;
            margin-bottom: 2rem;
        }

        .hero-desc {
            max-width: 600px;
            margin: 0 auto 3rem;
            opacity: 0.9;
        }

        .btn-primary-custom {
            background: var(--primary);
            border: none;
            padding: 0.8rem 2rem;
            font-weight: 600;
            letter-spacing: 0.5px;
            transition: var(--transition);
        }

        .btn-primary-custom:hover {
            background: var(--primary-dark);
            transform: translateY(-3px);
            box-shadow: 0 10px 20px rgba(108, 99, 255, 0.3);
        }

        /* About Section */
        #about {
            padding: 6rem 0;
            background: var(--dark);
        }

        .light-mode #about {
            background: white;
        }

        .profile-img {
            width: 100%;
            max-width: 400px;
            border-radius: 10px;
            box-shadow: 0 20px 30px rgba(0, 0, 0, 0.3);
            transition: var(--transition);
        }

        .profile-img:hover {
            transform: scale(1.02);
        }

        .about-text {
            padding-left: 2rem;
        }

        .personal-info {
            margin-top: 2rem;
        }

        .info-item {
            margin-bottom: 1rem;
            display: flex;
            align-items: center;
        }

        .info-item i {
            width: 30px;
            color: var(--primary);
            font-size: 1.1rem;
        }

        /* Skills Section */
        #skills {
            padding: 6rem 0;
        }

        .skill-card {
            background: var(--dark);
            border-radius: 10px;
            padding: 2rem;
            margin-bottom: 2rem;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            transition: var(--transition);
            height: 100%;
        }

        .light-mode .skill-card {
            background: white;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05);
        }

        .skill-card:hover {
            transform: translateY(-10px);
        }

        .skill-category {
            color: var(--primary);
            font-weight: 600;
            margin-bottom: 1.5rem;
        }

        .skill-item {
            margin-bottom: 1rem;
            display: flex;
            align-items: center;
        }

        .skill-icon {
            width: 24px;
            height: 24px;
            background: var(--primary);
            color: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-right: 1rem;
            font-size: 0.8rem;
        }

        /* Projects Section */
        #projects {
            padding: 6rem 0;
            background: var(--dark);
        }

        .light-mode #projects {
            background: white;
        }

        .project-card {
            background: var(--dark-light);
            border-radius: 10px;
            overflow: hidden;
            margin-bottom: 2rem;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            transition: var(--transition);
        }

        .light-mode .project-card {
            background: #f9f9f9;
        }

        .project-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.3);
        }

        .project-img {
            width: 100%;
            height: 200px;
            object-fit: cover;
        }

        .project-body {
            padding: 1.5rem;
        }

        .project-title {
            margin-bottom: 1rem;
            color: var(--light);
        }

        .light-mode .project-title {
            color: var(--dark);
        }

        .project-tech {
            margin-top: 1.5rem;
        }

        .tech-tag {
            display: inline-block;
            background: rgba(108, 99, 255, 0.2);
            color: var(--primary);
            padding: 0.3rem 0.8rem;
            border-radius: 20px;
            font-size: 0.8rem;
            margin-right: 0.5rem;
            margin-bottom: 0.5rem;
        }

        /* Contact Section */
        #contact {
            padding: 6rem 0;
        }

        .contact-card {
            background: var(--dark);
            border-radius: 10px;
            padding: 3rem;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            max-width: 600px;
            margin: 0 auto;
        }

        .light-mode .contact-card {
            background: white;
        }

        .contact-item {
            margin-bottom: 1.5rem;
            display: flex;
            align-items: center;
        }

        .contact-icon {
            width: 40px;
            height: 40px;
            background: var(--primary);
            color: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-right: 1rem;
            font-size: 1rem;
        }

        .social-links {
            margin-top: 2rem;
        }

        .social-link {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            width: 40px;
            height: 40px;
            background: rgba(108, 99, 255, 0.2);
            color: var(--primary);
            border-radius: 50%;
            margin-right: 1rem;
            transition: var(--transition);
        }

        .social-link:hover {
            background: var(--primary);
            color: white;
            transform: translateY(-3px);
        }

        /* Footer */
        footer {
            background: var(--dark);
            padding: 2rem 0;
            text-align: center;
        }

        .light-mode footer {
            background: #f5f5f5;
        }

        /* Theme Toggle */
        .theme-toggle {
            position: fixed;
            bottom: 30px;
            right: 30px;
            width: 50px;
            height: 50px;
            background: var(--primary);
            color: white;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            cursor: pointer;
            box-shadow: 0 5px 20px rgba(108, 99, 255, 0.3);
            z-index: 100;
            transition: var(--transition);
        }

        .theme-toggle:hover {
            transform: scale(1.1);
        }

        /* Animations */
        @keyframes float {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-20px); }
        }

        .floating {
            animation: float 6s ease-in-out infinite;
        }

        /* Responsive */
        @media (max-width: 992px) {
            .hero-title {
                font-size: 3rem;
            }
        }

        @media (max-width: 768px) {
            .hero-title {
                font-size: 2.5rem;
            }

            .about-text {
                padding-left: 0;
                margin-top: 2rem;
            }
        }
    </style>
</head>
<body>
<!-- Theme Toggle -->
<div class="theme-toggle" id="themeToggle">
    <i class="fas fa-moon"></i>
</div>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top">
    <div class="container">
        <a class="navbar-brand fw-bold" href="#">Deekshith M</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="#hero">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#about">About</a></li>
                <li class="nav-item"><a class="nav-link" href="#skills">Skills</a></li>
                <li class="nav-item"><a class="nav-link" href="#projects">Projects</a></li>
                <li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- Hero Section -->
<section id="hero">
    <div class="hero-bg"></div>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6 hero-content">
                <h1 class="hero-title">Hi, I'm <span class="text-primary">Deekshith</span></h1>
                <h2 class="hero-subtitle">Java Full Stack Developer</h2>
                <p class="hero-desc">I build robust, scalable enterprise applications with Java, Spring Boot, and modern architectures.</p>
                <div class="d-flex flex-wrap gap-3">
                    <a href="#contact" class="btn btn-primary-custom">Contact Me</a>
                    <a href="https://github.com/Deekshith0404" target="_blank" class="btn btn-outline-light">View GitHub</a>
                </div>
            </div>
            <div class="col-lg-6 d-none d-lg-block">
                <img src="https://img.freepik.com/free-vector/web-development-programmer-engineering-coding-website-augmented-reality-interface-screens-developer-project-engineer-programming-software-application-design-cartoon-illustration_107791-3863.jpg" alt="Code Illustration" class="img-fluid floating">
            </div>
        </div>
    </div>
</section>

<!-- About Section -->
<section id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-5">
                <img src="https://via.placeholder.com/400x500" alt="Deekshith M" class="profile-img">
            </div>
            <div class="col-lg-7 about-text">
                <h2>About Me</h2>
                <p>I'm a passionate Java full stack developer with expertise in building enterprise-grade applications using object-oriented programming principles and modern frameworks.</p>
                <p>With hands-on experience in Spring ecosystem, database management, and cloud technologies, I create efficient, maintainable solutions that scale.</p>

                <div class="personal-info">
                    <h4 class="mb-4">Personal Details</h4>
                    <div class="info-item">
                        <i class="fas fa-envelope"></i>
                        <span>deekshithdeekshi040@gmail.com</span>
                    </div>
                    <div class="info-item">
                        <i class="fas fa-map-marker-alt"></i>
                        <span>Rajajinagar, Bangalore, India</span>
                    </div>
                    <div class="info-item">
                        <i class="fas fa-language"></i>
                        <span>English, Kannada, Hindi</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Skills Section -->
<section id="skills">
    <div class="container">
        <h2 class="text-center mb-5">Technical Skills</h2>
        <div class="row">
            <div class="col-md-6">
                <div class="skill-card">
                    <h3 class="skill-category">Backend Development</h3>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Java (J2SE/J2EE)</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Spring Boot & Spring MVC</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Hibernate & JPA</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>RESTful API Development</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="skill-card">
                    <h3 class="skill-category">Database & DevOps</h3>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>MySQL, PostgreSQL</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>JDBC, SQL, PL/SQL</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Git & GitHub</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Maven, Gradle</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="skill-card">
                    <h3 class="skill-category">Web Technologies</h3>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>HTML5, CSS3, JavaScript</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>React.js</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Bootstrap, Tailwind</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Thymeleaf, JSP</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="skill-card">
                    <h3 class="skill-category">Tools & Platforms</h3>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>IntelliJ IDEA, Eclipse</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Postman, Swagger</span>
                    </div>
                    <div class="skill-item">
                        <div class="skill-icon"><i class="fas fa-check"></i></div>
                        <span>Linux/Windows</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Projects Section -->
<section id="projects">
    <div class="container">
        <h2 class="text-center mb-5">Featured Projects</h2>
        <div class="row">
            <div class="col-lg-6">
                <div class="project-card">
                    <img src="https://5.imimg.com/data5/OE/TR/MY-10642227/bike-showroom-interior-500x500.jpg" alt="Showroom Management" class="project-img">
                    <div class="project-body">
                        <h3 class="project-title">Showroom Management System</h3>
                        <p>A comprehensive web application for managing vehicle inventory, customer data, and sales processes in automobile showrooms.</p>
                        <div class="project-tech">
                            <span class="tech-tag">Spring MVC</span>
                            <span class="tech-tag">JPA</span>
                            <span class="tech-tag">Hibernate</span>
                            <span class="tech-tag">MySQL</span>
                            <span class="tech-tag">Bootstrap</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="project-card">
                    <img src="https://th.bing.com/th/id/OIP.VJAE7tierfoSYc1Z5fH5ggHaE7?rs=1&pid=ImgDetMain" alt="Dairy Management" class="project-img">
                    <div class="project-body">
                        <h3 class="project-title">Dairy Management System</h3>
                        <p>End-to-end solution for dairy farms to track milk production, inventory, distribution, and customer subscriptions.</p>
                        <div class="project-tech">
                            <span class="tech-tag">Java Servlets</span>
                            <span class="tech-tag">JDBC</span>
                            <span class="tech-tag">MySQL</span>
                            <span class="tech-tag">JavaScript</span>
                            <span class="tech-tag">Bootstrap</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Contact Section -->
<section id="contact">
    <div class="container">
        <div class="contact-card">
            <h2 class="text-center mb-5">Get In Touch</h2>
            <div class="contact-item">
                <div class="contact-icon">
                    <i class="fas fa-envelope"></i>
                </div>
                <div>
                    <h5>Email</h5>
                    <p>deekshithdeekshi040@gmail.com</p>
                </div>
            </div>
            <div class="contact-item">
                <div class="contact-icon">
                    <i class="fas fa-map-marker-alt"></i>
                </div>
                <div>
                    <h5>Location</h5>
                    <p>Rajajinagar, Bangalore, India</p>
                </div>
            </div>
            <div class="contact-item">
                <div class="contact-icon">
                    <i class="fas fa-globe"></i>
                </div>
                <div>
                    <h5>Connect</h5>
                    <div class="social-links d-flex">
                        <a href="https://www.linkedin.com/in/deekshith-m-438b98331" target="_blank" class="social-link">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a href="https://github.com/Deekshith0404" target="_blank" class="social-link">
                            <i class="fab fa-github"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Footer -->
<footer>
    <div class="container">
        <p class="mb-0">© <span id="year"></span> Deekshith M. All rights reserved.</p>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<!-- Custom JS -->
<script>
    // Theme Toggle
    // Enhanced Theme Toggle with Navbar Support
    const themeToggle = document.getElementById('themeToggle');
    const themeIcon = document.getElementById('themeIcon');
    const body = document.body;
    const navbar = document.querySelector('.navbar');

    // Check for saved theme preference
    if (localStorage.getItem('theme') === 'light') {
        enableLightMode();
    }

    themeToggle.addEventListener('click', toggleTheme);

    function toggleTheme() {
        if (body.classList.contains('light-mode')) {
            disableLightMode();
        } else {
            enableLightMode();
        }
    }

    function enableLightMode() {
        body.classList.add('light-mode');
        themeIcon.classList.replace('fa-moon', 'fa-sun');
        localStorage.setItem('theme', 'light');
        // Update navbar for light mode
        navbar.classList.remove('navbar-dark');
        navbar.classList.add('navbar-light');
    }

    function disableLightMode() {
        body.classList.remove('light-mode');
        themeIcon.classList.replace('fa-sun', 'fa-moon');
        localStorage.setItem('theme', 'dark');
        // Update navbar for dark mode
        navbar.classList.remove('navbar-light');
        navbar.classList.add('navbar-dark');
    }



    // Smooth scrolling for anchor links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function(e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });

    // Navbar background change on scroll
    window.addEventListener('scroll', function() {
        const navbar = document.querySelector('.navbar');
        if (window.scrollY > 100) {
            navbar.style.background = 'var(--primary)';
            navbar.style.boxShadow = '0 5px 20px rgba(0, 0, 0, 0.1)';
        } else {
            navbar.style.background = 'rgba(18, 18, 18, 0.8)';
            if (body.classList.contains('light-mode')) {
                navbar.style.background = 'rgba(255, 255, 255, 0.9)';
            }
            navbar.style.boxShadow = 'none';
        }
    });

    // Set current year in footer
    document.getElementById('year').textContent = new Date().getFullYear();
</script>
</body>
</html>