

# Git Ignore Hands-on Lab

## Objectives

- Understand the concept of `.gitignore`.
- Learn how to ignore unwanted files and folders using Git ignore.
- Implement `.gitignore` to prevent specific files from being tracked by Git.

---

## Prerequisites

The following are required to complete this lab:

- Git environment setup.
- Notepad++ configured as the default Git editor.
- A local Git repository.
- A remote repository in GitHub/GitLab.

---

# Lab Implementation

## Step 1: Create Git Repository

Create or navigate to the Git working directory.

Example:

```bash
cd GitDemo

Initialize Git repository:

git init
Step 2: Create Unwanted Files and Folders

Create a log file:

echo "Sample log data" > error.log

Create a log folder:

mkdir log

The working directory now contains:

GitDemo
│
├── error.log
└── log/
Step 3: Create .gitignore File

Create a .gitignore file:

touch .gitignore

Open .gitignore and add the following entries:

*.log
log/

Explanation:

*.log → Ignores all files with .log extension.
log/ → Ignores the log folder and its contents.
Step 4: Check Git Status

Execute:

git status

The .log files and log folder will not appear as untracked files.

Only files that are not mentioned in .gitignore will be displayed.

Step 5: Add and Commit Changes

Add the .gitignore file:

git add .gitignore

Commit the changes:

git commit -m "Added gitignore file to ignore log files"
Step 6: Verify Ignored Files

Check repository status:

git status

Output:

nothing to commit, working tree clean

This confirms that unwanted files are ignored by Git.

Step 7: Push Changes to Remote Repository

Add remote repository:

git remote add origin <repository-url>

Push changes:

git push origin master
Git Ignore Commands Summary
Command	Purpose
git init	Initializes a Git repository
touch .gitignore	Creates a gitignore file
git status	Checks repository status
git add	Adds files to staging area
git commit	Saves changes locally
git push	Uploads changes to remote repository
Conclusion

this shows how to use .gitignore to exclude unwanted files and folders from Git tracking. Log files (*.log) and log directories were successfully ignored, and the changes were committed and pushed to the remote repository.
