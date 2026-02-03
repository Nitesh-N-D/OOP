# Contributing to Java OOP All-in-One

Thank you for your interest in contributing. This document explains how to add notes, examples, and exercises, and how to submit a pull request.

---

## Guidelines

### Adding Notes

- Place notes in the topic folder they belong to (e.g. `All Topics/09Relationships/01Association/01OnetoOne/notes.txt`).
- Use clear, concise language. Prefer short paragraphs and bullet points.
- File names: use `notes.txt` or `Notes.txt` to match existing style; markdown (`.md`) is also welcome.
- Keep notes focused on the concept demonstrated in that folder.

### Adding Examples

- Add new example code in the appropriate topic folder under `All Topics/`.
- Use a `Main.java` (or `main.java`) for runnable demos; use descriptive class names for supporting classes (e.g. `Employee.java`).
- Ensure code compiles and runs. Follow existing naming and structure in that folder.
- One concept per example when possible, so learners can follow along easily.

### Adding Exercises

- Add new exercises under the `Exercise/` folder in a new subfolder (e.g. `Exercise/YourExerciseName/`).
- Include at least one main class (e.g. `main.java` or `Main.java`) that can be run.
- Optionally add a short `README.md` or `notes.txt` in the exercise folder describing the goal and how to run it.

### General

- **Do not change the existing folder structure** of topics and exercises; only add or extend.
- Keep file and folder names consistent with the rest of the repo (e.g. `Main.java` vs `main.java` per folder).
- Be respectful and constructive in issues and pull request discussions.

---

## How to Submit a Pull Request

1. **Fork** the repository and clone your fork locally.
2. **Create a branch** for your work:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes** following the guidelines above.
4. **Commit** with a clear message (e.g. "Add encapsulation example for getters/setters").
5. **Push** your branch to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```
6. **Open a Pull Request** on GitHub from your branch to this repo’s `main` branch.
7. In the PR description, briefly explain what you added or changed and why.

Maintainers will review your PR and may suggest edits. Once approved, it will be merged.

---

## Encouragement

Every contribution helps — whether it’s a new example, an exercise, a diagram, or improved notes. If you’re new to open source or Java, this repo is a great place to start. Don’t hesitate to ask questions in an issue or in your pull request.

Thank you for contributing.
