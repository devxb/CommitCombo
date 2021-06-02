# Contributing to CommitCombo

모든 contribute는 pull request를 통해서 해주시면 감사하겠습니다.


## 새로운 테마 요청

모든 테마는 CommitCombo/CommitProject/WEB-INF/classes/commitcombo/ThemeList/[ThemList](https://github.com/devxb/CommitCombo/tree/main/CommitProject/WEB-INF/classes/commitcombo/ThemList) 
에서 만들어집니다.

다음 양식에 따라 요청해주시면 감사하겠습니다.
아래 요청으로 모든 템플릿에 테마를 적용시킬수있습니다.

``` java
package commitcombo;

// 혼란을 막기위해 themeName과 class이름을 똑같게 설정해주세요
public class Apricot extends Theme{

public Apricot(){
	// themeName : 테마의 이름입니다. 만든 테마의 이름을 정해주세요
	this.themeName = "Apricot";
	// NameTagColor : 자신의 이름이 보이는 컬러 입니다.
	this.NameTagColor = "#FFFFFF";
	// CommitComboColor = "commitcombo"글자가 보이는 색입니다.
	this.CommitComboColor = "#FFFFFF";
	// ComboCntColor = 커밋기록(숫자)의 색입니다.
	this.ComboCntColor = "url(#Gradient)";
	// 카드의 백그라운드 색입니다.
	this.BackgroundColor = "url(#Gradient)";
	// 커밋기록(숫자)의 뒤 정사각형 박스의 색깔입니다.
	this.ComboBoxColor = "#FFFFFF";
	// 그라데이션색을 사용하고싶을시 아래 4줄을 수정하면됩니다.
	// stop offset = 각각 시작위치 와 끝나는 위치입니다.
	// gradientTransform = 그라데이션의 기울기입니다.
	// stop-color = 그라데이션의 색입니다.
	this.Gradient = "<linearGradient id=\"Gradient\" gradientTransform=\"rotate(20)\">\n";
	this.Gradient += "<stop offset=\"0%\" stop-color=\"#E58C8A\"/> \n";
	this.Gradient += "<stop offset=\"100%\" stop-color=\"#EEC0C6\"/> \n";
	this.Gradient += "</linearGradient>";
}

}
```
### 모든 pull request 다른사람에의해 사용될수있습니다.
