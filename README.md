# notification-service

* Due to Junit dependency (testing framework) we are seeing 2 additional jars in the left panel.
* We added junit as a dependency but it is bringing hamcrest jar also, so it is called transitive dependency.

![image](https://user-images.githubusercontent.com/17001948/99902011-ba033180-2ce0-11eb-951e-b8f2ca431e58.png)

# Check the class present in Junit jar.
* Below shows Assert class is from Junit jar.
![image](https://user-images.githubusercontent.com/17001948/99902041-e159fe80-2ce0-11eb-86b1-7e408b667dd5.png)

# Build your project using maven.
* Go to project root directory. And open a cmd. Use the command `mvn package`
![image](https://user-images.githubusercontent.com/17001948/99902110-54637500-2ce1-11eb-9e5c-1c93fcc75771.png)

* The command `mvn package` will compile source code under src/ , testCompile test source code, execute test cases, finally bundle all your source classe as a .jar file.
![image](https://user-images.githubusercontent.com/17001948/99902168-b7eda280-2ce1-11eb-9cd7-84d2e8f38142.png)

![image](https://user-images.githubusercontent.com/17001948/99902173-c6d45500-2ce1-11eb-9445-6ea210239026.png)

* your .jar file can be located under target/

![image](https://user-images.githubusercontent.com/17001948/99902186-deabd900-2ce1-11eb-8f37-908d4fd82102.png)

# Jar file never contains test class. It contains source code compiled class only.

* create a temp directory. copy your jar file to temp directory.
![image](https://user-images.githubusercontent.com/17001948/99902209-131f9500-2ce2-11eb-937e-b9a7f45180d6.png)
* open a cmd under temp/ and run the jar file under temp with the command: `java -cp notification-service-1.0-SNAPSHOT.jar org.example.App`
![image](https://user-images.githubusercontent.com/17001948/99902233-49f5ab00-2ce2-11eb-8b9f-5ce94a8948a0.png)
* extract the jar: `jar -xvf notification-service-1.0-SNAPSHOT.jar`
![image](https://user-images.githubusercontent.com/17001948/99902259-7ad5e000-2ce2-11eb-83f6-a9c2fa2209b7.png)
* You can see above lines says it has only compiled src/ code.

