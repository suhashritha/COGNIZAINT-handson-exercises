# Git Cleanup and Push to Remote Repository

## Objective

This hands-on lab demonstrates how to synchronize a local Git repository with a remote repository by pulling the latest changes, verifying repository status, and pushing local commits to the remote repository.

## Learning Outcomes

After completing this lab, you will be able to:

* Verify the status of a Git repository.
* View available local and remote branches.
* Pull the latest changes from a remote repository.
* Push local commits to a remote repository.
* Verify that changes are successfully reflected in the remote repository.

---

# Prerequisites

* Git installed on the system
* Git Bash
* GitHub account
* Remote repository configured
* Completion of:

  * Git-T03-HOL_001 (Branching and Merging)
  * Git-T03-HOL_002 (Merge Conflict Resolution)

---

# Hands-on Steps

## Step 1: Verify Master Branch is Clean

Check the current repository status.

```bash
git status
```

Expected Output:

```text
On branch master
nothing to commit, working tree clean
```

---

## Step 2: List Available Branches

Display all local branches:

```bash
git branch
```

Display local and remote branches:

```bash
git branch -a
```

Example Output:

```text
* master
  remotes/origin/master
```

---

## Step 3: Pull Latest Changes from Remote Repository

Fetch and merge changes from the remote repository.

```bash
git pull origin master
```

Expected Output:

```text
Already up to date.
```

or Git will download and merge the latest changes.

---

## Step 4: Push Local Changes to Remote Repository

Push the commits created during previous hands-on exercises.

```bash
git push origin master
```

Expected Output:

```text
Enumerating objects...
Counting objects...
Writing objects...
To https://github.com/username/repository.git
```

If everything is already synchronized:

```text
Everything up-to-date
```

---

## Step 5: Verify Changes in Remote Repository

Open the GitHub repository in a web browser and verify:

* Latest commits are visible.
* Updated files are present.
* README files are uploaded.
* Commit history reflects recent changes.

You can also verify using:

```bash
git log --oneline --graph --decorate
```

---

# Commands Used

```bash
git status
git branch
git branch -a
git pull origin master
git push origin master
git log --oneline --graph --decorate
```

---

# Expected Outcome

* Repository is verified to be in a clean state.
* Available branches are listed successfully.
* Latest changes are pulled from the remote repository.
* Local commits are pushed successfully to GitHub.
* Changes are visible in the remote repository.
* Local and remote repositories remain synchronized.

---

# Conclusion

This lab demonstrated the final stage of the Git workflow: synchronizing local and remote repositories. By verifying repository status, pulling the latest updates, and pushing local commits, developers ensure that their work is safely stored in the remote repository and available for collaboration with team members.
