# The (former) Google Annotations Gallery (GAG)

## First, A Little History

Back in 2010, one of Google's April Fool's Day jokes was this gallery of goofball Java annotations.
 
 While clearly silly, over in the corner of the Enterprise Java world I was working in the annotations struck a chord; the ability to mark code as `@Facepalm` or `@LegacySucks` was sized on by developers the way a thirsty person in a desert would size a glass of water.  (I'm personally aware of at least two shipped, production codebases with the GAG fully included.)

  Personally, I loved it.  I think our entire profession would benefit from more of this kind of whimsy.  Every codebase should have something in it that makes you smile, and seeing a class annotated with `@Booyah` or `@InfiniteImprobabilityDriveFactor` does the trick.
    
But, time marches on, and when Google shut down Google Code, the GAG wasn't one of the projects that made it on to a life boat.  The google code archive has a [tombstone for it](https://code.google.com/archive/p/gag/), but the project has faded into the mists of time.


 There's a few forks lying around, and... this is one of them.
 
 I've left ANT as the build tool, rather than modernize it into Gradle or Maven, as it seemed more appropriate for the codebase's vintage quality.
 
  
 
 
 The first part of the original GAG readme follows.
 
 
 
 

## Google Annotations Gallery

The Google Annotations Gallery is an exciting new Java open source library that provides a rich set of annotations for developers to express themselves. Do you find the standard Java annotations dry and lackluster? Have you ever resorted to leaving messages to fellow developers with the `@Deprecated` annotation? Wouldn't you rather leave a `@LOL` or `@Facepalm` instead? If so, then this is the gallery for you.

Not only can you leave expressive remarks in your code, you can use these annotations to draw attention to your poetic endeavors. How many times have you written a palindromic or synecdochal line of code and wished you could annotate it for future readers to admire? Look no further than `@Palindrome` and `@Synecdoche`.

But wait, there's more. The Google Annotations Gallery comes complete with dynamic bytecode instrumentation. By using the gag-agent.jar Java agent, you can have your annotations behavior-enforced at runtime. For example, if you want to ensure that a method parameter is non-zero, try `@ThisHadBetterNotBe(Property.ZERO)`. Want to completely inhibit a method's implementation? Try `@Noop`.

If we've whet your appetite for truly expressive annotations, then read on and immerse yourself in the Google Annotations Gallery.

Update

A new distribution has been uploaded (gag-1.0.1.zip) to add many great user-suggested annotatons. This update includes the annotations listed below, which includes a new Team category for annotations that apply to your development team. Take a look at the Javadocs for details.

New for 1.0.1

Disclaimer 
* @AhaMoment 
* @BossMadeMeDoIt 
* @HandsOff 
* @IAmAwesome 
* @LegacySucks

Enforceable 
* @CantTouchThis 
* @ImaLetYouFinishBut

Literary Verse (new subcategory) 
* @Burma Shave 
* @Clerihew 
* @DoubleDactyl 
* @Haiku (moved to this subcategory) 
* @Limerick 
* @Sonnet

Remarks 
* @Fail 
* @OhNoYouDidnt 
* @RTFM 
* @Win

Team (new category) 
* @Blame 
* @Channeling 
* @Fired 
* @HonorableMention 
* @Visionary
 
 