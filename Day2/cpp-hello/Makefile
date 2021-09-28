all: bin/hello.o bin/main.o
	g++ bin/hello.o bin/main.o -o bin/main.exe

bin/hello.o: src/hello.cpp
	g++ -c src/hello.cpp -o bin/hello.o

bin/main.o: src/main.cpp
	g++ -c src/main.cpp -o bin/main.o

clean:
	rm -f bin/*.o
	rm -f bin/*.exe
