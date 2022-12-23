java -jar ./lib/antlr-4.11.1-complete.jar ugk.g4 -no-listener -no-visitor -o ./src/parser
javac -cp "./lib/antlr-4.11.1-complete.jar;./src" ./src/Main.java -d ./bin
java -cp "./lib/antlr-4.11.1-complete.jar;./bin" Main ./examples/fibotest.ugk
