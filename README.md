
Feature
---

* Android 好像沒有類似 cocoapod 的地方
* 之前有下載過類似由作者彙整各式 library 的 app，但現在忘記叫什麼了，而且他們更新不夠快
* 想要有個地方能讓大家以 pull request 的方式上傳小巧、但很有用的 android demo
* 像是以一種 Duolingo + 愛料理的組合來建立出一顆 Android Skill Tree!
* 但如果一個 demo 要寫一個 app 又很麻煩
* 全部 demo 擠在一個 app 裡面也很髒
* 或許能利用 Android Studio 下一個 Project 中可以包含多個 Module 的方式來乾淨的做到？

Cons
---

* 寫 library module 的門檻有點高
* 多點 module 後 build 不知道會不會變慢...
* 要讓別人未來能 import library 似乎不太方便，不知道能否想個方法結合 maven central?

Question
---

* 要怎麼做 global 的 dependency import?

Future Work
---

* Add travis CI!



Reference Photo~
--

![](https://github.com/hiiamyes/AndroidSkillTree/blob/develop/readme/duolingo.png)
![](https://github.com/hiiamyes/AndroidSkillTree/blob/develop/readme/lovecook.png)
