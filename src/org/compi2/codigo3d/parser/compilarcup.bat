SET JAVA_HOME="C:\Program Files\Java\jdk1.7.0_21\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Mynor Masaya\Documents\NetBeansProjects\MakerC3D\src\org\compi2\codigo3d\parser
java -jar java-cup-11a.jar -parser parser -symbols sym sintactico.cup
pause