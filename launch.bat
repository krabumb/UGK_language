java -jar ./lib/antlr-4.11.1-complete.jar Ugk.g4 -no-listener -visitor -o ./src/parser
javac -cp "./lib/antlr-4.11.1-complete.jar;./src" ./src/Main.java -d ./bin
java -cp "./lib/antlr-4.11.1-complete.jar;./bin" Main ./examples/testchatgpt.ugk
