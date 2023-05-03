// Composables
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/carte',
    name: 'Carte',
    component: () => import('@/views/Carte.vue'),
   },
    {
      path: '/cititor',
      name: 'Cititor',
      component: () => import('@/views/Cititor.vue'),
     },
      {
        path: '/imprumut',
         name: 'Imprumut',
          component: () => import('@/views/Imprumut.vue'),
       },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
