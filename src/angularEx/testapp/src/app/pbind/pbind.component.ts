import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pbind',
  templateUrl: './pbind.component.html',
  //styleUrls: ['./pbind.component.css'] 
  styles: [`
    img{
    height: 300px;
    width: 300px;}
  `]
})
export class PbindComponent implements OnInit {  
  constructor() { } 

  imgUrl = 'assets/imgs/Education.png';  
  imgUrl1 = 'assets/imgs/Health.png';  
  imgUrl2 = 'assets/imgs/Agriculture.png';  
  textColor = 'orange';  
  textColor1 = 'blue';  
  textColor2 = 'green';  

  ngOnInit(): void {  
    console.log('PbindComponent initialized');  
  }
}
