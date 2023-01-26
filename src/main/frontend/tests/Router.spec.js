import { describe, it, expect, test, vi } from 'vitest'
  import { mount } from '@vue/test-utils'
  import router from '@/router'
  import HomeView from '@/views/HomeView.vue'

  function mountHomeView() {
    const wrapper = mount(HomeView, {
      global: {
        plugins: [router]
      }
    })
    return wrapper
  }

  describe('The Router', () => {
    it('Link Form Request ok', () => {
      expect(mountHomeView().text()).toContain('Fill Form Request')
    })

    it('Link List Request ok', () => {
        expect(mountHomeView().text()).toContain('List Request')
      })

    test.skip('click the links', async () => {
      const push = vi.spyOn(router, 'push')

      await mountHomeView().find('a[class="nav__link nav__link-form"]').trigger('click')

      expect(push).toHaveBeenCalledOnce()
      expect(push).toHaveBeenCalledWith('/FormView')

      await mountHomeView().find('a[class="nav__link nav__link-list"]').trigger('click')
      
      expect(push).toHaveBeenCalledTimes(2)
      expect(push).toHaveBeenCalledWith('/ListView')
    })
  })


  describe ('HomeView', () => {
    test('exist class nav on HomeView', () => {
      const nav = mount(HomeView);
      expect(nav.classes('nav')).toBe(true)
    })
  })