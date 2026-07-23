# Git Branching and Merging using Git

## Objective

This hands-on lab demonstrates the concepts of **Git Branching** and **Git Merging**. The exercise covers creating a new branch, making changes in that branch, comparing it with the master branch, merging the changes, and deleting the branch after a successful merge.

## Learning Outcomes

After completing this lab, you will be able to:

* Understand Git branching and merging concepts.
* Create and switch between branches.
* Add and commit changes in a branch.
* Compare differences between branches using Git commands.
* View visual differences using P4Merge.
* Merge a feature branch into the master branch.
* View commit history using Git log.
* Delete a merged branch safely.

## Prerequisites

* Git installed on the system
* Git Bash
* P4Merge configured as Git's merge/diff tool
* GitHub account
* Local Git repository

---

# Branching

### Step 1: Create a New Branch

```bash
git branch GitNewBranch
```

### Step 2: List Local and Remote Branches

```bash
git branch -a
```

The `*` symbol indicates the currently active branch.

### Step 3: Switch to the New Branch

```bash
git checkout GitNewBranch
```

or

```bash
git switch GitNewBranch
```

### Step 4: Create a File

```bash
echo "This file is created in GitNewBranch." > branch.txt
```

### Step 5: Add the File

```bash
git add branch.txt
```

### Step 6: Commit the Changes

```bash
git commit -m "Added branch.txt in GitNewBranch"
```

### Step 7: Check Repository Status

```bash
git status
```

---

# Merging

### Step 1: Switch to Master Branch

```bash
git checkout master
```

or

```bash
git switch master
```

### Step 2: Compare Differences

```bash
git diff master GitNewBranch
```

### Step 3: View Visual Differences using P4Merge

```bash
git difftool master GitNewBranch
```

### Step 4: Merge Branch into Master

```bash
git merge GitNewBranch
```

### Step 5: View Commit History

```bash
git log --oneline --graph --decorate
```

### Step 6: Delete the Merged Branch

```bash
git branch -d GitNewBranch
```

### Step 7: Verify Repository Status

```bash
git status
```

---

# Commands Used

```bash
git branch GitNewBranch
git branch -a
git checkout GitNewBranch
echo "This file is created in GitNewBranch." > branch.txt
git add branch.txt
git commit -m "Added branch.txt in GitNewBranch"
git status
git checkout master
git diff master GitNewBranch
git difftool master GitNewBranch
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status
```

---

# Expected Outcome

* A new branch is successfully created.
* Changes are committed to the branch.
* Differences between branches are viewed using both Git and P4Merge.
* The feature branch is successfully merged into the master branch.
* Commit history displays the merge operation.
* The merged branch is deleted successfully.
* Repository remains clean after the merge.

---

# Conclusion

This lab demonstrates the complete Git branching workflow, including branch creation, committing changes, comparing branches, merging into the master branch, viewing commit history, and cleaning up by deleting the merged branch. These operations are fundamental to collaborative software development using Git.
