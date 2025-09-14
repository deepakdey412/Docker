## **1️⃣ Docker Installation on Windows**

### **Step 1: Check System Requirements**

* Windows 10 64-bit: Pro, Enterprise, or Education (Build 19041+) **or** Windows 11
* Enable **WSL 2** (Windows Subsystem for Linux) and **Virtualization** in BIOS.
* At least 4GB RAM recommended.

Official requirements: [Docker Desktop Windows Requirements](https://docs.docker.com/desktop/windows/install/)

---

### **Step 2: Install WSL 2 (if not already)**

1. Open PowerShell as Admin and run:

   ```powershell
   wsl --install
   ```
2. Restart your computer.

Guide: [Install WSL 2](https://learn.microsoft.com/en-us/windows/wsl/install)

---

### **Step 3: Download Docker Desktop for Windows**

* Go to: [Docker Desktop for Windows](https://www.docker.com/products/docker-desktop/)
* Click **Download for Windows (Windows 10/11)**

---

### **Step 4: Install Docker Desktop**

1. Run the downloaded installer.
2. Select **Use WSL 2 instead of Hyper-V** during installation.
3. Finish installation and restart if prompted.

---

### **Step 5: Verify Installation**

1. Open Command Prompt or PowerShell.
2. Run:

   ```powershell
   docker --version
   docker run hello-world
   ```
3. You should see a success message from Docker. ✅

---

## **2️⃣ Docker Installation on Mac**

### **Step 1: Check System Requirements**

* macOS 13 or later (for Apple Silicon M1/M2 or Intel chip)
* At least 4GB RAM recommended

Requirements: [Docker Desktop Mac Requirements](https://docs.docker.com/desktop/mac/install/)

---

### **Step 2: Download Docker Desktop for Mac**

* Go to: [Docker Desktop for Mac](https://www.docker.com/products/docker-desktop/)
* Choose the correct version: **Apple chip** or **Intel chip**

---

### **Step 3: Install Docker Desktop**

1. Open the downloaded `.dmg` file.
2. Drag Docker icon to the Applications folder.
3. Launch Docker from Applications.
4. Follow initial setup instructions.

---

### **Step 4: Verify Installation**

1. Open Terminal.
2. Run:

   ```bash
   docker --version
   docker run hello-world
   ```
3. You should see a “Hello from Docker!” message. ✅

---

### **3️⃣ Optional: Learn Docker Basics**

* Official Docker tutorials: [Docker Get Started](https://docs.docker.com/get-started/)
* Learn commands, containers, images, and Docker Compose.

---


