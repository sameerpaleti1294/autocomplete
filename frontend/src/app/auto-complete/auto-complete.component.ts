import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';
import { AutoCompleteService } from './auto-complete.service';
import {Observable} from 'rxjs';
import {map, startWith} from 'rxjs/operators';

@Component({
  selector: 'app-auto-complete',
  templateUrl: './auto-complete.component.html',
  styleUrls: ['./auto-complete.component.css']
})
export class AutoCompleteComponent implements OnInit {

  myControl = new FormControl();
  options: string[] = [];
  constructor(private autoCompleteService: AutoCompleteService) { }

  ngOnInit(): void {
  }

  modelChanged(value: string) {
    this.autoCompleteService.getSuggestions(value).subscribe(
      (response) => this.options = response);
  }

}
