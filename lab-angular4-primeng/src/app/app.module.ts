import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TelaComponent } from './tela/tela.component';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {PanelModule, InputMaskModule} from 'primeng/primeng';

@NgModule({
  declarations: [
    AppComponent,
    TelaComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    PanelModule,
    InputMaskModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

