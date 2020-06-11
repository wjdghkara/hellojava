
@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-11.0.7\
set path=%PATH%;%JAVA_HOME%\bin
set CLASS_PATH=%JAVA_HOME%\bin;.

javac Hello.java