
# Git Merge Conflict Resolution

## Objective

This hands-on lab demonstrates how Git handles merge conflicts and how to resolve them using both the command line and a visual merge tool (P4Merge). The lab simulates two developers making conflicting changes to the same file in different branches and then resolving the conflict during the merge.

## Learning Outcomes

After completing this lab, you will be able to:

* Understand why merge conflicts occur.
* Create and work with Git branches.
* Modify the same file in different branches.
* Identify merge conflicts.
* Compare changes using Git Diff.
* Resolve conflicts using P4Merge (3-Way Merge).
* Commit the resolved changes.
* Configure `.gitignore`.
* Delete merged branches.
* View Git commit history.

---

# Prerequisites

* Git installed
* Git Bash
* P4Merge configured as Git's merge/diff tool
* Existing Git repository
* Completion of the Branching & Merging Hands-on Lab

---

# Hands-on Steps

## Step 1: Verify Master Branch is Clean

```bash
git status
```

Expected Output:

```
On branch master
nothing to commit, working tree clean
```

---

## Step 2: Create a New Branch

```bash
git branch GitWork
git checkout GitWork
```

or

```bash
git switch -c GitWork
```

---

## Step 3: Create `hello.xml`

```bash
echo "<message>Hello from GitWork Branch</message>" > hello.xml
```

Check status:

```bash
git status
```

---

## Step 4: Commit the Changes

```bash
git add hello.xml
git commit -m "Added hello.xml in GitWork branch"
```

---

## Step 5: Switch to Master

```bash
git checkout master
```

---

## Step 6: Create `hello.xml` with Different Content

```bash
echo "<message>Hello from Master Branch</message>" > hello.xml
```

---

## Step 7: Commit the Changes

```bash
git add hello.xml
git commit -m "Added hello.xml in master branch"
```

---

## Step 8: View Commit History

```bash
git log --oneline --graph --decorate --all
```

---

## Step 9: Compare Differences

```bash
git diff master GitWork
```

---

## Step 10: Visual Comparison Using P4Merge

```bash
git difftool master GitWork
```

---

## Step 11: Merge the Branch

```bash
git merge GitWork
```

Git detects a conflict because both branches modified the same file.

Example:

```
Auto-merging hello.xml
CONFLICT (add/add): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and then commit the result.
```

---

## Step 12: Observe Conflict Markers

Open `hello.xml`.

Git inserts conflict markers like:

```xml
<<<<<<< HEAD
<message>Hello from Master Branch</message>
=======
<message>Hello from GitWork Branch</message>
>>>>>>> GitWork
```

---

## Step 13: Resolve Conflict Using P4Merge

Launch the merge tool:

```bash
git mergetool
```

Choose the desired content or manually combine both changes.

Example resolved file:

```xml
<message>Hello from Master Branch</message>
<message>Hello from GitWork Branch</message>
```

Save and close the merge tool.

---

## Step 14: Commit the Resolved Merge

```bash
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"
```

---

## Step 15: Ignore Backup Files

Create or edit `.gitignore`.

```text
*.orig
*.bak
```

Check status:

```bash
git status
```

Commit the changes:

```bash
git add .gitignore
git commit -m "Added backup files to .gitignore"
```

---

## Step 16: List Available Branches

```bash
git branch
```

or

```bash
git branch -a
```

---

## Step 17: Delete the Merged Branch

```bash
git branch -d GitWork
```

---

## Step 18: View Final Commit History

```bash
git log --oneline --graph --decorate
```

---

# Commands Used

```bash
git status
git branch GitWork
git checkout GitWork
echo "<message>Hello from GitWork Branch</message>" > hello.xml
git add hello.xml
git commit -m "Added hello.xml in GitWork branch"
git checkout master
echo "<message>Hello from Master Branch</message>" > hello.xml
git add hello.xml
git commit -m "Added hello.xml in master branch"
git log --oneline --graph --decorate --all
git diff master GitWork
git difftool master GitWork
git merge GitWork
git mergetool
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"
git add .gitignore
git commit -m "Added backup files to .gitignore"
git branch
git branch -d GitWork
git log --oneline --graph --decorate
```

---

# Expected Outcome

* Master branch is initially clean.
* A new branch (`GitWork`) is created.
* The same file is modified differently in both branches.
* Git detects a merge conflict.
* The conflict is resolved successfully using P4Merge (3-Way Merge).
* The resolved changes are committed.
* Backup files are ignored using `.gitignore`.
* The merged branch is deleted.
* Git history clearly shows the merge and conflict resolution.

---

# Conclusion

This lab demonstrates the complete merge conflict resolution workflow in Git. You learned how conflicts occur when multiple branches modify the same file, how to inspect differences, resolve conflicts using a 3-way merge tool (P4Merge), commit the resolved changes, and maintain a clean repository by ignoring unnecessary backup files. These skills are essential for effective collaboration in team-based software development.
