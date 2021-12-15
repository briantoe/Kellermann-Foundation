# Instructions to run HMIS database

## Programs needed

Latest stable version of [Tomcat](https://tomcat.apache.org/download-80.cgi).
Latest version of [MariaDB](https://mariadb.org/download/).
An IDE with Java and server capabilities, you can use [Intellij IDEA Ultimate](https://www.jetbrains.com/idea/) or [Visual Studio Code](https://code.visualstudio.com/) with [Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug) and [Tomcat](https://marketplace.visualstudio.com/items?itemName=adashen.vscode-tomcat) extentions.
[Java Development Kit](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) is also needed but you likely already have installed on your system.

>Make sure you use the Ultimate edition as that is the only way to interact with databases in Intellij. It is [free for students](https://www.jetbrains.com/student/).
>Between IntelliJ IDEA Ultimate and Visual Studio Code, it is much easier working with the former.

These instructions are for windows, scroll further down for mac instructions.
>For mac users: since the instructions for windows are more straight-forward, it may be ideal to install a VM to run windows and follow the instructions for windows.

## Installing Tomcat and MariaDB

### Tomcat

Using the .exe install method will prompt you for component selection and server configuration.
In component selection, make sure you install the Host Manager, it makes troubleshooting **much** easier and can be helpful later in the install process.
In server configuration, set a username and password.

### MariaDB

Install all components.
It will walk you through the setup and ask you for a password. Use "t00r" as the password. This because of the password that Osbert uses and that is hard-coded in the code.

## Setting up environment

In order for your system to see these Tomcat and MariaDB in your terminal, you need to add your programs to your system environment varaibles.
First, open **System Properties**, then open **Environment Variables**. Click the **Edit** button for system variables (make sure you're not editing your user variables just above). Then hit the **New** button and add the PATH variables for your programs. You want to use the **/bin** folder inside the program folder.
![env variable setup](https://i.imgur.com/vArAOqn.jpg)
>My PATH variables for MariaDB and Tomcat are marked by the yellow arrows.

You will be able to run "mysql" in your terminal after a restart of your computer. If there is an error reading "access denied for user...", then you have set up MariaDB successfully.

## Running Tomcat inside an IDE

We will be using Intellij IDEA Ultimate for this documentation. Using VS Code instead will be fairly straight forward provided you understand how to run Tomcat inside Intellij, and know how VS Code is structured.

Launch Intellij and open the **hospital_maternity_hmis_project** folder inside the **Kellermann-Foundation** folder. This is where Tomcat will set its starting directory when you start up the server.

>Make sure your Project SDK is **Java 1.8** inside Project Structure (located in the File tab or the grid icon in the top left of the IDE).

Next we need to add a Tomcat configuration. There is a configuration dropdown between the build and run icons in the toolbar, click it and open the **Edit Configurations** link.
Click **Add New Configuration** and select Tomcat Server. You may need to hit a "Show more" button of some kind. It will ask you if you want a local or a remote configuration, select **local**.
Intellij should auto-populate the default settings which *may* work out of the box.

In the Tomcat folder, there will be a file called server.xml, search for and open it and change the shutdown port from -1 to 82 (or any other positive integer).

Try running the program using the Build & Run buttons, it should open the login page at [http://localhost:8080/BHMS/](http://localhost:8080/BHMS/)

If it doesn't work, try changing the port and URL in the Edit Configurations panel and the server.xml file. For example, change [http://localhost:8080/BHMS/](http://localhost:8080/BHMS/) to [http://localhost:8082/BHMS/](http://localhost:8082/BHMS/)

Make sure the HTTP and the URL match if you make any port changes.
Other issues can come up, Google may help you resolve those.

## Populating the Database

To populate the database, you need to run commands inside the MariaDB shell. Search for MariaDB on your computer, you should see a shell with the name **Command Prompt (MariaDB 10.4 (x64))**. Open it, and note that the shell opens to your *\Windows\system32* folder. You need to change the directory to the folder containing the database SQL scripts located in **\Kellermann-Foundation\sql**.

Use the cd function to change your directory. You can simply copy the address of your SQL folder in Windows Explorer and paste it into the MariaDB command prompt (use right click to paste).

My command was: `cd C:\Users\zarro\OneDrive\Documents\Visual Studio Code\Projects\Kellermann-Foundation\sql`
>Note that my username and location for my folder will be different than yours.

Or you can cd your way through your whole filesystem:

![cd](https://i.imgur.com/tr58MjZ.png)

Now you can run the log-in command:

`mysql -u root -p`

It will ask you for a password, enter the one you used to setup MariaDB.

MariaDB will load so you can run MySQL commands, we will use the source command.

The syntax is:

`source filename.fileextension`

so our commands will be:

`source bwindihospital_reduced.sql`

`source HMIS_Script.sql`

Run `bwindihospital_reduced.sql` first, `then HMIS_Script.sql`. You will need to do this anytime there are changes to the database.

## Launching the Database

Build & Run the program and this time, you will be able to log in with the credentials:
> **Username:** emmanual
> **Password:** bwindi

Congratulations, you're finished, you will never have to do this ever again! (hopefully)

## Miscellaneous

If you decide to use Visual Studio Code, note that you will need to use the Tomcat extension to run on Tomcat server. Either use a **.war** file or simply right click the **hospital_maternity_hmis_project** folder and hit "Run on Tomcat server".

Add dependencies to Visual Studio Code using the "Java Dependencies" pane.

---

## Using GitHub

## Terminology

- A commit is what you will be "pushing" to the origin. When you make a commit, you save those changes to your local repository meaning those changes are only on your machine.
- A push is used to upload local repository content to a remote repository. Pushing is how you transfer commits from your local repository to a remote repo.
- A pull is used to fetch and download content from a remote repository and immediately update the local repository to match that content. It checks and downloads all new changes.
- A fetch is used to download commits, files, and refs from a remote repository into your local repo.  It checks to see if there are any changes available.

[Source](https://www.atlassian.com/git/tutorials/syncing)

## Software Needed

- [GitHub Desktop](https://desktop.github.com/)
- [Git Bash](https://gitforwindows.org/) (Optional, but required if you are using VS Code or CLI)

## Setting up GitHub Desktop

1. Launch GitHub Desktop
2. Open File > Options
3. Log in to your GitHub Account
4. Either clone the repository if you don't have it downlaoded already or add local repository and find where your existing repository

>The repository URL is `https://github.com/utdEPICS/Kellermann-Foundation.git`

## Using GitHub Desktop

![Select your respository](https://i.imgur.com/EZnKWwb.png)

>Select the repository. Note that I have two respositories with the same name, one is a fork (a copy) and one is the official UTDEPICS repository. The owner is listed above each.

![Walkthrough](https://i.imgur.com/tfJkdSf.png)

1. This is your list of changes. They can be simple edits to entire files being created or deleted. The checkmark to the left of the filename lets you add or remove that file from the commit.

2. The description for your commit.

3. Your branch. Each repository has a master branch which is generally the latest production code. You can also create more branches for staging changes for the master (think of it as a beta repository) or other usecases. Here, we have a branch just for spring 2020 changes.

4. Fetching/Pushing origin button. This button lets you grab the latest changes from upstream (the spring 2020 branch in this instance) or push your changes to the upstream.

>To make a commit, simply check which files you wish to commit, add a description, and hit the commit button at the bottom left.

![Pushing](https://i.imgur.com/gR0hzN5.png)

1. The push origin button shows you how many local commits you have and lets you push to the origin.

2. Same as the first button but smaller and less blue.

3. Your un-commited changes. These would be files you haven't finished editing or files you don't want to upload.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

Step-by-step instructions for installing the required tools on MacOS Locally

Locally: 

Installing the Environment: 

Install IntelliJ IDEA Ultimate (recommended) or Visual Studio Code with Java and Tomcat extensions. Follow the instructions in the “Modern Instructions.md” file on GitHub for setting up the environment, running Tomcat inside the IDE and populating the Database. This file provides instructions for installing required tools and fixing common issues you might run into on your MacOS. 

Note: Windows users can use the “Modern Instructions.md” file on GitHub  

Installing Tomcat on macOS: 

Prerequisite: Java, Java Development Kit 

Open Terminal app and run the following command: 

java –version 

This lets you ensure that java is correctly installed with the correct version. 

Tomcat 9.x requires Java 8 or later  

Download tar.gz in Binary Distribution under the Core section of Tomcat software download page here: http://tomcat.apache.org/download-90.cgi 

Open the archive in the Downloads folder and you should see a filename that looks like the following: 

apache-tomcat-9.0.xx (Our version was 9.0.45) 

Open Terminal App and enter the following commands: 

sudo mkdir -p /usr/local 

sudo mv ~/Downloads/apache-tomcat-9.0.35 /usr/local 

sudo rm -f /Library/Tomcat 

sudo ln -s /usr/local/apache-tomcat-9.0.35 /Library/Tomcat 

 

Change the ownership of the Library/Tomcat/ folder hierarchy: 

sudo chown -R <your_username> /Library/Tomcat 

 

Make scripts within Tomcat executable: 

sudo chmod +x /Library/Tomcat/bin/*.sh  

 

Running and stopping Tomcat: 

/Library/Tomcat/bin/startup.sh 

/Library/Tomcat/bin/shutdown.sh 

 

Installing MariaDB on macOS (Using Homebrew package manager): 

 

The easiest way to install MariaDB is by doing so using the Homebrew Package Manager.  

 

Install homebrew if not already available on your MacOS X: 

/bin/bash -c "$(curl –fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" 

 

After installing Homebrew, install MariaDB with the following commands: 

brew install mariadb 

 

Start MariaDB server: 

mysql.server start 

 

(OR) 

 

Alternatively, MariaDB can be started using Homebrew’s funcitonalities: 

brew services start mariadb 

 

Login as root: 

sudo mysql -u root 

 

Enter the password when prompted to do so. 

 

Issues you might run into while installing MariaDB with Homebrew: 

 

“The post-install step did not complete successfully” 

Stop any MySQL service on you computer by running the following command in the Terminal: 

 

brew services stop mariadb 

 

You will need to delete contents of /usr/local/var/mysql by using the following command: 

 

sudo rm -rf /usr/local/var/mysql 

 

Enter your password 

 

Run the following command: 

 

mysql_install_db --verbose --user=`whoami` --basedir="$(brew --prefix mariadb)" --datadir=/usr/local/var/mysql --tmpdir=/tmp 

 

Startup MariaDB: 

brew services start mariadb 

 

Log into MySQL: 

sudo mariadb -u root 

 

Finally, you’ll need to change the user’s root password: 

use mysql; 

ALTER USER 'root'@'localhost' IDENTIFIED BY 'enter-your-new-password'; 

flush privileges; 

quit 

 

Log into MariaDB again: 

mariadb -u root –p 

 

Issues installing MariaBD when the native MySQL is already installed on MacOS: 

It is very likely that you will run into issues when you’re trying to install MariaDB with 	the native MySQL server already installed on your OSX. 

 

Follow this tutorial to learn how to uninstall MySQL and upgrade to MariaDB without 	any conflicts: 

 

https://gist.github.com/brandonsimpson/5204ce8a46f7a20071b5 
