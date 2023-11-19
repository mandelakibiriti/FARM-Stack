Using open [EHR OPT](https://github.com/ppazos/openEHR-OPT) you can visualize the template generated in the form of a web form. 

### Pre-requisites

**`NOTE:`**
> Ensure to be using **open-jdk8** and groovy 2.5.5 while making the gradle build. 

If you have different installations of java ie. open-jdk or Oracle JDK you can set it to openjdk using the commmand below:

```bash
$ sudo update-alternatives --config java
```
You will get an output as shown below:
```bash
Output
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                         Priority   Status
------------------------------------------------------------
  0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java   1111      auto mode
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java   1111      manual mode
* 2            /usr/lib/jvm/java-11-oracle/bin/java          1091      manual mode

Press <enter> to keep the current choice[*], or type selection number:
```


> To install groovy and gradle you can use [sdkman](https://sdkman.io/install) to install groovy and gradle. Used Gradle 8.1.1

```bash
$ sdk install sdk_name version
$ sdk list sdk_name -> will give you a list of specific versions of the sdk_name you intend to install.
```

### Using Open EHR OPT
A [form](symptom-sign.v0_20230613112256_en.html) is generated using the `uigen` command in the terminal. 

1. First clone the open EHR OPT repo

```bash
$ git clone https://github.com/ppazos/openEHR-OPT.git
$ cd openEHR-OPT
```

2. Run gradle to build the Java instance of open EHR OPT. Ensure you are using openjdk8 and above with groovy 2.5.5

```bash
$ gradle build
...

Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/8.1.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 22s
9 actionable tasks: 9 executed
```

3. Ensure the path in `opt.sh` pointing to the `opt.jar` file is accurate as indicated in the parent folder.
```bash
java -cp "./lib/*:$GROOVY_HOME/lib/*:build/libs/opt-1.9.6.jar" com.cabolabs.openehr.opt.Main $1 $2 $3 $4 $5 $6 $7
```

4. Run the CLI command below to generate the UI form in html.

```bash
$ ./opt.sh uigen path_to_opt dest_folder
```