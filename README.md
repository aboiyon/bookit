# My Collections 

An android app consuming IT Book Store API. Implementing all the common android application features and good mpbile application development practices. I'm just polishing and improving my software engineering skills.

## Getting Started

Clone this repository to your local repository. Open it with your favourite IDE (ANDROID STUDIO). Build it and run it using build in AVD..

### Prerequisites

You need the following software's installed:
- java
- JDK - Java Development Kit
- Gradle
- Android virtual device
- An IDE - ANDROID STUDIO

To confirm run the following command on linux
```
$ java --version
$ gradle --version
```

### Installing

* Clone this project using ``` git clone https://github.com/lanarokip/score.git```

Open the folder with your favourite IDE.
* Navigate into the ``` src/main/java/App.java ``` and click run in androidStudio .
* click on the run button and navigate to the AVD .

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Unit testing with Espresso and Robolectric

### Break down into end to end tests

Local Testing 
- To run local tests which run on the JVM without an emulator/device, use Robolectric unit testing framework. With Robolectric, we will test the behaviours of a particular component in isolation of other components.
- Start by adding libraries and dependencies.
- Create test classes.
- Then finally write tests and run them.
- Further test with Shadows. Shadows are Classes that correspond with any Android classes that run as part of a Robolectric test.
- In order to use shadows, applications must be configured to use 'org.apache.http.legacy' library.
- Unit tests classes should reflect the activity whose logic they're testing. (ie: Tests meant to cover logic present in MainActivity will reside in a MainActivityTest class. Tests covering logic in a WelcomeActivity will reside in a WelcomeActivityTest class.)

Instrumentation Testing
- Tests that require an Android device or an emulator to simulate a user. Use Espresso, a UI test framework that creates automated tests that run on an actual device/emulator.
- Configure Espresso, to avoid flakiness, it is recommended to turn off system animations on virtual/physical devices used for testing.
- Create test classes and rules.
- Write unit tests and run them.
- Instrumentation tests classes should have names that reflect the classes they are testing(ie: Instrumentation tests that correspond to the MainActivity will reside in a class called MainActivityInstrumentationTest.)
```
Give an example
```

### And coding style tests

1. Android Lint: Android Lint is a built-in static code analysis tool in Android Studio. It analyzes your code for potential bugs, performance issues, and style violations. It includes various checks related to coding style, such as indentation, naming conventions, unused resources, and more. Android Lint can be run from the command line or integrated into your build process.
2. Checkstyle: Checkstyle is a widely used tool for enforcing coding style guidelines in Java and Kotlin code. It provides a wide range of checks for naming conventions, indentation, whitespace, Javadoc comments etc. Checkstyle can be configured with a predefined set of rules or customized to match your specific coding style requirements.  
3. Code formatting in Android Studio: Android Studio provides built-in code formatting options that help enforce coding style guidelines.  You can configure the code formatting settings according to your preferred style and apply them to your codebase. Android Studio can automatically format your code or show warnings when code does not comply with the specified style.
4. Code review and peer feedback: Conducting code reviews and seeking feedback from peers is an effective way to ensure adherence to coding style guidelines. Peer code reviews allow team members to provide feedback on style violations, suggest improvements, and ensure consistency across the project. 

```
Give an example
```

## Deployment

Google Play Developer Accounts
- To publish your own applications on Google Play you must register for a Google Play Developer account. Registering costs a one-time fee. Visit https://play.google.com/apps/publish/signup/# to register.
Launch Checklist
- Thoroughly review the Android this checklist https://developer.android.com/distribute/tools/launch-checklist.html. It contains everything you need to know in order to prapare, package, and publish an application for distribution.
Signing your Application
- Apps must be uploaded to play store as an APK(Android Package) file which must be signed with a unique certificate.
Creating a Certificate
- Follow these instructions https://developer.android.com/studio/publish/app-signing.html 

## Built With

* [Gradle](https://gradle.org/) - Dependency Management.
* [Maven](https://maven.apache.org/) - Dependency Management.

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Kiprotich Cheruiyot** - *Initial work* - [PetFound](https://github.com/aboiyon/PetFound)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
