

# 🚀 **Introduction to Docker**

---

## 🐳 **What is Docker?**

Docker is an **open-source platform** that allows you to **build, package, and run applications** inside **lightweight, isolated environments** called **containers**.
Think of it like **a portable box** that contains everything your application needs to run — so it works anywhere!

---

## 📦 **Key Concepts in Docker**

### 1️⃣ **Docker Image** 🖼

* A **blueprint** for creating containers.
* Contains the application code, dependencies, OS libraries, and settings.
* **Read-only** — meaning it cannot be changed once created.
* Example: `nginx:latest`, `python:3.9`

---

### 2️⃣ **Docker Container** 📦

* A **running instance** of a Docker image.
* Lightweight and portable.
* Multiple containers can run from the same image.
* Containers are **isolated** but can communicate with each other via networks.

---

### 3️⃣ **Dockerfile** 📄

* A **text file** that contains step-by-step instructions to create a Docker image.
* Example:

```dockerfile
FROM python:3.9  
COPY . /app  
WORKDIR /app  
RUN pip install -r requirements.txt  
CMD ["python", "app.py"]
```

* Run `docker build -t myapp .` to create the image.

---
![Docker in Action](https://k21academy.com/wp-content/uploads/2021/06/Peek-2021-06-19-12-14.gif)

---

## 🔄 **How it Works (Flow)**

1. **Write a Dockerfile** → describes the app setup.
2. **Build an Image** → `docker build` creates an image from the Dockerfile.
3. **Run a Container** → `docker run` starts a container from the image.
4. **Share** → Push your image to **Docker Hub** or any registry so others can use it.

---

## 🆚 **Docker vs Virtual Machine (VM)**

| Feature      | Docker 🐳      | Virtual Machine 💻 |
| ------------ | -------------- | ------------------ |
| Startup Time | Seconds        | Minutes            |
| Size         | MBs            | GBs                |
| Performance  | Faster         | Slower             |
| OS Layer     | Shares host OS | Has full OS        |

---
