# Project 3 - *Instagram*

**Instagram** is a photo sharing app similar to Instagram but using Parse as its backend.

Time spent: **8** hours spent in total

## User Stories

The following **required** functionality is completed:

- [X] User can sign up to create a new account using Parse authentication.
- [X] User can log in and log out of his or her account.
- [X] The current signed in user is persisted across app restarts.
- [X] User can take a photo, add a caption, and post it to "Instagram".

The following **optional** features are implemented:

- [ ] User sees app icon in home screen and styled bottom navigation view
- [ ] Style the feed to look like the real Instagram feed.
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse.

The following **additional** features are implemented:

- [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

https://mail.google.com/mail/u/0?ui=2&ik=19cb9a6513&attid=0.1&permmsgid=msg-a:r7741885743377277265&th=16e593b3983075c6&view=att&disp=safe&realattid=f_k2u2iy1w0

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.
The main challenge was the whole debugging issue. I had one error code that I did not unerstand for a bit "method getParseUser in class ParseObject cannot be applied to given types" which I kept thinking was a typo on my end (since those are the majority of my error codes) but this was more of a syntax error. Going into the "Build" line actually helps tremendously in trying to figure where theses errors are and why they occur. I am slowly getting better at debugging my own code.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
