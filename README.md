# MacroSwarm DEMO
This is a minimal example of a MacroSwarm application. 
It is a simple application that uses the MacroSwarm library to control a swarm of robots.

## Smoke test
To test if the application is working, run the following command:
```bash
sbt runAlchemist
```
After that, you should see a window with a simulation running.

## Structure:
The application is composed of the following files:
- `build.sbt`: the build file of the application, it has the definition of how to run alchemist (look at the `runAlchemist` task)
- `src/main/scala/example/SimpleMovement`: a simple macro swarm application with brownian motion
- `src/main/yaml/main.yml`: the configuration file for the presented simulation

Please, for more details about MacroSwarm refer to the [documentation](https://scafi.github.io/macro-swarm/)