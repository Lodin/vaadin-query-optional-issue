import { Route } from '@vaadin/router';
import {findAll} from './generated/ErrorEndpoint';

export type ViewRoute = Route & { title?: string; children?: ViewRoute[] };

export const views: ViewRoute[] = [
  {
    path: '/',
    async action() {
      await findAll({
        nonOptionalField: 1,
      })
    }
  }
];
export const routes: ViewRoute[] = [...views];
