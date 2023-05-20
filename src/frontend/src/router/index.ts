// Composables
import {createRouter, createWebHistory} from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'HomePage',
    meta: {
      title: 'Home Page'
    },
    component: () => import('@/views/HomePage.vue'),
  },

  {
    path: '/carte',
    name: 'Carte',
    meta: {
      title: 'Carte'
    },
    component: () => import('@/views/Carte.vue'),
  },
  {
    path: '/cititor',
    name: 'Cititor',
    meta: {
      title: 'Cititor'
    },
    component: () => import('@/views/Cititor.vue'),
  },
  {
    path: '/imprumut',
    name: 'Imprumut',
    meta: {
      title: 'Imprumut'
    },
    component: () => import('@/views/Imprumut.vue'),
  },
  {
    path: '/student',
    name: 'Student',
    meta: {
      title: 'Student'
    },
    component: () => import('@/views/Student.vue'),

  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

router.beforeEach((to, from, next) => {
  document.title = to.meta.title as string || 'Aplicatie Imprumut';
  next();
});


export default router
