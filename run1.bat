set projectLocaton=C:\Users\91866\eclipse-workspace\Project
cd %projectLocaton%
set classpath=%projectLocaton%\bin;%projectLocaton%\lib\*
java org.testng.TestNG %projectLocaton%\testng.xml
