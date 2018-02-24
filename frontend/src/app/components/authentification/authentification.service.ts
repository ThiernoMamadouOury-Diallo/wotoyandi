import { Injectable } from '@angular/core';
import { Http, Response, RequestOptions, Headers, Request, RequestMethod} from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { User } from './user.definition';

import 'rxjs/add/operator/toPromise';

@Injectable()
export class AuthentificationService {

  private url = '/bff/greeting/';  // URL to web api
  constructor(private http: Http) {
  }

    me(id: String): Observable<User> {
      return this.http.get(this.url + id)
        .map((resp: Response) => resp.json() as User)
        .catch(this.handleError); // Trouble line.
      // Without this line code works perfectly.
    }

  public handleError(error: Response) {
    console.error(error);
    return Observable.throw(error.json().error || 'Server error');
  }

}
