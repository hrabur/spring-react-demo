# Demo application of Spring Boot with ReactJS

Application is assembled with [Spring Boot Initializr](https://start.spring.io/) and [Create React App](https://github.com/facebookincubator/create-react-app)

## Prerequisites

In order to run the demo you need the follwoing thinks:
- [Eclipse IDE for Java EE developers](https://www.eclipse.org/downloads/eclipse-packages/)
- [Node.js LTS](https://nodejs.org/en/)
- [Atom editor](https://atom.io/) with the follwoing packeges:
    - [language-babel](https://atom.io/packages/language-babel)
    - [linter-eslint](https://atom.io/packages/linter-eslint)
    - [js-hyperclick](https://atom.io/packages/js-hyperclick) (you need to install first [hyperclick](https://atom.io/packages/hyperclick))
    - [minimap](https://atom.io/packages/minimap) and [minimap-linter](https://atom.io/packages/minimap-linter)

## How to run the demo
In order to run and play with the demo you need to:
1. Clone the project from GitHub
2. Import the project in Eclipse as `Existing Maven Project`
3. Import the  `src/main/frontend` foledr in Atom as `Open Project Folder`
4. Run the Sprong Boot application from Eclipse as normal Java Application
    - Locate Application.java file
    - Run As > Java Application
5. Run the ReactJS part in development mode
    - Open Command Prompt in `src/main/frontend` folder
    - Run `npm start`
    - You're default web browser will appear
