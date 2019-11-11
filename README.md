# What is the purpose of the project ?

This repo is based on the work from the existing repo hakimel/reveal.js and dgageot/demoit. 

While in the need to use a reveal.js which support terminal integration, I expected to use `demoit` to solve this need.
However, I met numerous issues while trying to include a terminal into `reveal.js`, and at least as much troubles when trying to build the slides with `demoit`.

Thus I mixed both to an "easier" solution in regards of my urging needs.

The actual solution is a reveal.js presentation, including a reveal.js plugin for code sample integration (`sampler.js`).
I added the `demoit.js` library to take benefit of its html components `web-browser` and, mainly, `web-terminal`, but slightly modified it to not use the initialy expected endpoint from `demoit`. Instead, this version is expected to run coupled with a local instance of `web-term.js`.

This version is expected to offers simplest customization than allowed by `demoit`, as the stack is mainly based on `reveal.js`

# How to run the slides

As its based on `reveal.js`, building and launching the slides follow the same process :

-  build with 
```
npm install
```

- starts with
```
npm start
```

But, to use the terminal integration you should install and run `web-term` too:

```
npm install --global web-term
```

- to run it with `fish`
```
web-term -p 3000 -b fish
```

or with `zsh`
```
web-term -p 3000 -b zsh
```

(default shell is `bash`)