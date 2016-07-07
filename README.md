# OmdbMapper

## Requirements
You just need gson (you can download the jar directly from [here](http://repo1.maven.org/maven2/com/google/code/gson/gson/2.3.1/gson-2.3.1.jar)).

## Usage
Actually there is a hardcoded URL to OMDb's API. So you can just run the `main` method to see the result.

## What happened?
The `main` method reads the json from the API as a String. `gson` provides the functionality to automatically parse this text and convert it into a Java Object. 
In this case I wrote the Class `Movie`. For functionality, the class name doesn't matter, but the prívate variables of the class has to be named exactly like the json keys (e.g. json key 'Title' ends up in a private class attribute 'Title').
I override the `toString` method of the `Movie` class to easily print a movie object to the console.


