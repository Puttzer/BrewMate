import { BrowserRouter as Router, Routes, Route } from 'react-router';
import { Suspense, lazy } from 'react';
import { ReactNode } from 'react';

const AppShell = lazy(() => import('../components/AppShell'));
const Home = lazy(() => import('../pages/Home'));
const ErrorBoundary = ({ children }: { children: ReactNode }) => {
  try {
    return children;
  } catch {
    return <div>Error loading component</div>;
  }
};

const AppRouter = () => (
  <Router>
    <ErrorBoundary>
      <Suspense fallback={<div>Loading...</div>}>
        <Routes>
          <Route path='/' element={<AppShell />}>
            <Route index element={<Home />} />
            <Route path='login' element={<h1>Login</h1>} />
          </Route>
        </Routes>
      </Suspense>
    </ErrorBoundary>
  </Router>
);

export default AppRouter;
