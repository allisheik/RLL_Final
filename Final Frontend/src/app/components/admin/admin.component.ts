import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CardServiceService } from 'src/app/services/card-service.service';
import { ShareInfoService } from 'src/app/services/share-info.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
 search = "";
 public cards:any;
  constructor(private CardServiceService: CardServiceService, private data:ShareInfoService) {  }

  ngOnInit(): void {
    this.CardServiceService.showCards().subscribe((cards) => {
      this.cards = cards;
    })
    this.data.shareSearch.subscribe(rtvdv => this.search =rtvdv)
  }
sendDataToMovie(card:object){
  this.data.exchangeDta(card)
}
deleteCard(cardId:number){
  this.CardServiceService.deleteCard(cardId).subscribe(res => {})
  location.reload();
}

}
