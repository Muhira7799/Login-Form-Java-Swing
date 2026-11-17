# Login Form – Java Swing

A simple Java desktop login form built with Swing. It checks a username and password and shows a message.

## Features

- Username field and a masked password field (`JPasswordField`)
- **Login** button
- Message dialogs for success and failure

## How It Works

The credentials are checked in `actionPerformed`:

```java
if (user.equals("admin") && pass.equals("1234")) {
    JOptionPane.showMessageDialog(this, "Login successful!");
} else {
    JOptionPane.showMessageDialog(this, "Invalid username or password.");
}
```

The demo credentials are:

| Username | Password |
|----------|----------|
| `admin` | `1234` |

| Input | Message |
|-------|---------|
| `admin` / `1234` | Login successful! |
| Anything else | Invalid username or password. |

## Important: Demo Only

The username and password are written directly in the source code, which is fine for learning but not for a real application. Real applications store hashed passwords in a database and never keep credentials in code.

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac LoginForm.java
java LoginForm
```

## Project Structure

```
.
├── LoginForm.java
└── README.md
```

## Possible Improvements

- Check the credentials against a MySQL database with JDBC
- Hash passwords instead of comparing plain text
- Limit the number of failed attempts
- Open a main window after a successful login
