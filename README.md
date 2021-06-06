


<div align = "center">
  <br>
  <a href="https://github.com/devxb/CommitCombo"><img src = "http://commitcombo.com/logo" align="center"/></a> <br><br><br>
  <img src = "http://commitcombo.com/get?user=Devxb&theme=Lake-mini" align="center" alt="Github Commt Combo"/>
  <img src = "http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini" align="center" alt="Github Commit Combo"/>
  <img src = "http://commitcombo.com/get?user=Devxb&theme=Sunset-mini" align="center" alt="Github Commit Combo"/>
  <img src = "http://commitcombo.com/get?user=Devxb&theme=Cloud-mini" align="center" alt="Github Commit Combo"/><br>
  <h2></h2>
<a href="https://hits.seeyoufarm.com"><img src="https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fdevxb%2FCommitCombo&count_bg=%23212121&title_bg=%231488CC&icon=&icon_color=%231488CC&title=visitor&edge_flat=false"/></a>
</div>
<div align = "center">  ⭐스타를 눌러주세요 개발에 큰 도움이 됩니다!⭐️</div>
<div align="center"><a href="./ENG.md"> English </a></div>
<div align = "center"> 
<h3>연속된 커밋기록을 아름답게 관리하세요<h3> <h4> 커밋을 끊기지 않고 연속해서 할 경우 숫자가 올라갑니다. <br>하루라도 커밋을 안하면 숫자가 0으로 초기화 됩니다.</h4>
<p> 아이디어나 발견 한 버그가 있다면 제보 해주세요<br><br>
<b><i>Contact : develxb@gmail.com</i></b></p>



<p align = "center">
private repository 커밋기록이 잘 반영되지 않고있다면, <br>
Contribution setting에서 Private contributions를 체크하세요
</p>
<div align = "center"> 
    <img src = "http://commitcombo.com/serverClock"/>
    <br/>
    <p>
        <b>커밋기록은 서버시간 하루전날을 기준으로 반영됩니다.</b>
    </p>
</div>

</div>

<div>
<ul>
목록
<li>
	<a href = "#availableTheme"> 사용가능한 테마</a>
</li>
<li>
	<a href = "#maker"> 빠른 만들기 및 모든 테마 보기</a>
</li>
<li>
	<a href = "#manual"> 사용법 및 예시</a>
</li>
<li>
	<a href = "#history"> 버전기록</a>
</li>
<li>
	<a href = "#issue"> 발견된 이슈 </a>
</li>
</ul>
</div>
<h2></h2>
<div align = "center">
<h3> <a name = "availableTheme"></a>사용가능한 테마</h3>
</div>

<h3>theme</h3> 

<img src = "https://user-images.githubusercontent.com/62425964/120197420-e41f4880-c25b-11eb-99ea-cc93ad62628d.png"/><br>
<img src = "https://user-images.githubusercontent.com/62425964/120197426-e5507580-c25b-11eb-8d33-215eebb3be38.png"/><br>

<h2></h2>
<h3> <a name = "maker"> </a> 빠른 만들기 및 모든 테마 보기</h3>
아래 사진(<a href = "http://commitcombo.com/maker">링크</a>)을 클릭하고 적용 예시를 확인하며 당신의 테마를 만들수있습니다!

[![commitcombo-maker](https://user-images.githubusercontent.com/62425964/119252836-4d161900-bbe9-11eb-8e30-7984ef18337d.jpeg)](http://commitcombo.com/maker)


<h2></h2>
<h3> <a name = "manual"></a>사용법 및 예시</h3>
<p>
유저 이름이 길경우 슬라이딩해서 보여줍니다. 원하지않을시 URL끝에 &animation=false를 적어서 요청하세요.
</p>
<img src = "http://commitcombo.com/get?user=ABCDEFGHIJKLMNOP&theme=MintChocolate-mini"/> <img src = "http://commitcombo.com/get?user=ABCDEFGHIJKLMNOP&theme=MintChocolate-mini-v2"/> 
<br>
<p>
아래 링크를 자신의 README.md파일에 복사 붙여넣기 하시면 됩니다. <br> 
{username}에는 자신의 깃허브 이름, <br>
{theme}에는 자신이 원하는 테마를 넣으시면 됩니다.
</p>

	[![commitcombo](http://commitcombo.com/get?user={username}&theme={theme})](https://github.com/devxb/CommitCombo)

<p> 예제 <br>
{username} : Devxb, <br>
{theme} : DeepOcean-mini 일때.
</p>

	[![commitcombo](http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini)](https://github.com/devxb/CommitCombo)

[![commitcombo](http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini)](https://github.com/devxb/CommitCombo)



정렬하면서 적용하는법
	
- align 에 정렬위치를 지정합니다 (left, center, right)    
- img 의 ?user 뒤에 자신의 깃허브 이름을 지정합니다.

```html
<p align="center">
  <a href="https://github.com/devxb/CommitCombo">
    <img src="http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini"/>
  </a>
</p>
```
<p align="center">
  <a href="https://github.com/devxb/CommitCombo">
    <img src="http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini"/>
  </a>
</p>



<h2></h2>
<a name = "history"></a>

<h3> Version history </h3>

<ul>
<h4> version -1.7 / 2021.06.06</h4>
<li>
 로직 수정
 contribution을 github graphql api호출하는방식으로 변경했습니다.
</li>
</ul>

<ul>
<h4> version -1.6 / 2021.06.01 </h4>
<li>
 로직 수정
</li>
<li>
 컨트롤러 jsp에서 servlet으로 변경
</li>
<li>
 저장 방식 변경 세션에 저장하지않고, 내부 저장소에 저장(임시)
</li>
</ul>

<ul>
<h4> version -1.5 /2021.05.29</h4>
<li>
 Add minitheme-v2
</li>
<li>
 유저이름이 긴 경우 보여지는 방식을 변경했습니다.
</li>
<li>
 이제 유저 이름이 짤릴경우, 옆으로 슬라이딩 하며 유저이름을 보여줍니다. 원하지않을시 &animation = false를 추가 하면됩니다.<br>
 <img src = "http://commitcombo.com/get?user=ABCDEFGHIJKLMNOP&theme=MintChocolate-mini"/> <img src = "http://commitcombo.com/get?user=ABCDEFGHIJKLMNOP&theme=MintChocolate-mini-v2"/>
</li>
</ul>

<ul>
<h4> version -1.4 / 2021.05.26</h4>
<li>
  <b>폰트 적용 안되는 문제 해결!!</b>
</li>
<li>
  파란색 계열 테마 추가 <br> <img src = "http://commitcombo.com/get?user=Devxb&theme=Lake-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Ocean-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=DeepOcean-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Depths-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Cloud-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Emerald-mini"/> 
</li>
</ul>

<ul>
<h4> version -1.3 / 2021.05.25 </h4>
<li>
	약간의 성능 개선
</li>
<li>
	이슈 해결
</li>
<li>
	add calendar theme
</li>
</ul>

<ul>
<h4> version -1.2 / 2021.05.24</h4>
	<li> <a href = "http://commitcombo.com/maker">빠른 만들기</a> 기능 추가</li>
	<li> 애니메이션 수정 </li>
</ul>

<br>

<ul>
<h4>version -1.1 / 2021.05.23</h4>
	<li> add Gradient Theme <br> <img src = "http://commitcombo.com/get?user=Devxb&theme=Peach-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=CottonCandy-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Grass-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Perfume-mini"/> <img src = "http://commitcombo.com/get?user=Devxb&theme=Indigo-mini"/>
	</li>
</ul>

<br>

<ul> 
<h4>version -1.0 / 2021.05.22</h4>
	<li> 출시 </li>

<h2></h2>
<a name = "issue"></a>
<h3> 발견된 이슈 </h3>

<ul>
<li>
<b> (해결?) 3~4년간 끊기지않고 커밋한경우 초기 데이터를 얻어오는데 너무 오래걸림 해결책 생각중입니다 </b>
<br> - 내부저장소를 만들어서 1회 로딩시 그 다음부터는 빠르게 얻어옴
</li>
<br>
<li>
<b> (해결) 서버에 요청이 동시에 발생할경우 요청내용이 꼬이는 문제점이 발견되었습니다.</b>
<br> - 싱글톤패턴안에 (문제가되는)스태틱변수를 없애고, 변수를 반환해주는식의 로직으로 변경했습니다.
</li>
<br>
<li>
<b> (해결) 폰트가 적용되지않고있습니다. </b>
</li>
<br>
<li>
<b> (해결) 1년이 넘은 커밋기록이 반영되지 않고있습니다. </b>
</li>
<br>
<li>
<b> (해결) 커밋기록이 실시간으로 반영되지 않고있습니다. </b>
<br> - 깃허브가 캐시한 이미지가 깃허브 서버에 남아있는거로 보입니다. 
<br> - 시간이 지나면 자동으로 해결되지만, 커널에 다음 명령어를 입력해서 바로 해결할수있습니다.   <br> : "curl -X PURGE [캐시된 url]"
</li>
<br>
<li>
<b> (해결) 애니메이션이 초기 1회만 재생되고 재생이 안됩니다. 해결 </b>
<br> - 위 이유와 같은 원인으로 파악되며 해결책을 생각중입니다.
<br> - [Ctrl + shift + R] 로 애니메이션을 강제 시작할수있습니다.
<br> : Ctrl + Shift + R
</li>
</ul>

<h2></h2>

<p>코드, 디자인 배포및, 수정후 재배포 하지말아주세요.</p>

